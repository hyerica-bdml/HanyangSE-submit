package edu.hanyang.submit;

import java.io.IOException;
import io.github.hyerica_bdml.indexer.ExternalSort;


public class HanyangSEExternalSort implements ExternalSort {

    /**
     * External sorting     
     * @param infile    Input file
     * @param outfile   Output file
     * @param tmpdir    Temporary directory to be used for writing intermediate runs on 
     * @param blocksize Available blocksize in the main memory of the current system
     * @param nblocks   Available block numbers in the main memory of the current system
     * @throws IOException  Exception while performing external sort
     */
    @Override
    public void sort(String infile, String outfile, String tmpdir, int blocksize, int nblocks) throws IOException {
        // TODO: your code here...
    }
}
