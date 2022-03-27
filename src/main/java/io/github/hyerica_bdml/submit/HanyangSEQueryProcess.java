package io.github.hyerica_bdml.submit;

import java.io.IOException;

import io.github.hyerica_bdml.indexer.DocumentCursor;
import io.github.hyerica_bdml.indexer.IntermediateList;
import io.github.hyerica_bdml.indexer.IntermediatePositionalList;
import io.github.hyerica_bdml.indexer.QueryPlanTree;
import io.github.hyerica_bdml.indexer.QueryProcess;
import io.github.hyerica_bdml.indexer.StatAPI;

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