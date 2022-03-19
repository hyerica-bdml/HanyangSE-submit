package edu.hanyang.submit;

import java.io.IOException;

import edu.hanyang.indexer.DocumentCursor;
import edu.hanyang.indexer.IntermediateList;
import edu.hanyang.indexer.IntermediatePositionalList;
import edu.hanyang.indexer.QueryPlanTree;
import edu.hanyang.indexer.QueryProcess;
import edu.hanyang.indexer.StatAPI;

public class HanyangSEQueryProcess implements QueryProcess {

    @Override
    public void opAndWithPosition(DocumentCursor op1, DocumentCursor op2, int shift, IntermediatePositionalList out)
            throws IOException {
                
        // TDOO: your code here...
    }

    @Override
    public void opAndWithoutPosition(DocumentCursor op1, DocumentCursor op2, IntermediateList out) throws IOException {
        // TODO: your code here...
    }

    @Override
    public QueryPlanTree parseQuery(String query, StatAPI stat) throws Exception {
        // TODO: your code here...
        return null;
    }
}