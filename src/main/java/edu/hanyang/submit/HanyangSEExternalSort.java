package edu.hanyang.submit;

import java.io.IOException;

import edu.hanyang.indexer.ExternalSort;


public class HanyangSEExternalSort implements ExternalSort {

    /**
     * External sorting
     * @param infile    정렬되지 않은 데이터가 있는 파일
     * @param outfile   정렬된 데이터가 쓰일 파일
     * @param tmpdir    임시파일을 위한 디렉토리
     * @param blocksize 허용된 메모리 블록 하나의 크기
     * @param nblocks   허용된 메모리 블록 개수
     */
    @Override
    public void sort(String infile, String outfile, String tmpdir, int blocksize, int nblocks) throws IOException {
        // TODO: your code here...
    }
}
