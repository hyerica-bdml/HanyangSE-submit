package edu.hanyang;


import edu.hanyang.submit.HanyangSEExternalSort;
import io.github.hyerica_bdml.indexer.ExternalSort;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ExternalSortTest {

    private static final String INPUT_DATA_PATH = "data/input_10000000.data";
    private static final String OUTPUT_DATA_PATH = "data/output_10000000.data";
    private static final String TEMP_DIR_PATH = "tmp/";
    private static final int BLOCKSIZE = 1024*8;
    private static final int N_BLOCKS = 1000;

    private static ExternalSort sort;

    private static void removeDir(final Path path) throws IOException {
        if (Files.exists(path) && Files.isDirectory(path)) {
            for (File file : path.toFile().listFiles()) {
                if (file.isDirectory())
                    removeDir(file.toPath());
                else
                    Files.deleteIfExists(file.toPath());
            }
        }
    }

    @BeforeClass
    public static void prepare() throws IOException {
        if (Files.exists(Paths.get(TEMP_DIR_PATH)) && Files.isDirectory(Paths.get(TEMP_DIR_PATH))) {
            removeDir(Paths.get(TEMP_DIR_PATH));
        } else {
            Files.createDirectory(Paths.get(TEMP_DIR_PATH));
        }

        sort = new HanyangSEExternalSort();
    }

    @Test
    public void testSort() throws IOException {

        long currentTime = System.currentTimeMillis();
        sort.sort(INPUT_DATA_PATH, OUTPUT_DATA_PATH, TEMP_DIR_PATH, BLOCKSIZE, N_BLOCKS);
        long duration = System.currentTimeMillis() - currentTime;
        System.out.println("Duration: " + ((double) duration / 1000.0));

        try (FileInputStream fin = new FileInputStream(OUTPUT_DATA_PATH);
             BufferedInputStream bin = new BufferedInputStream(fin);
             DataInputStream in = new DataInputStream(bin)) {

            int previousTermId = -1;
            int previousDocId = -1;
            int previousPos = -1;

            while (in.available() > 0) {
                int termId = in.readInt();
                int docId = in.readInt();
                int pos = in.readInt();

                Assert.assertTrue(previousTermId <= termId);
                if (previousTermId == termId) {
                    Assert.assertTrue(previousDocId <= docId);

                    if (previousDocId == docId)
                        Assert.assertTrue(previousPos <= pos);
                }

                previousTermId = termId;
                previousDocId = docId;
                previousPos = pos;
            }
        }
    }
}

