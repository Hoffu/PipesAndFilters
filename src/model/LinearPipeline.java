package model;

import java.util.ArrayList;

public class LinearPipeline implements IPipeline {
    private OPTYPE optype;
    private ArrayList<IComponent> links;

    public enum OPTYPE {
        AND,
        OR
    }

    public LinearPipeline(String optype) {
        this.optype = OPTYPE.valueOf(optype);
        links = new ArrayList<>();
    }

    @Override
    public void addLink(IComponent link) {
        links.add(link);
    }

    public boolean process(OutputStream outputStream) {
        if (optype == OPTYPE.AND) {
            for (IComponent link : links) {
                if (!link.process(outputStream))
                    return false;
            }
            return true;
        }
        if (optype == OPTYPE.OR) {
            for (IComponent link : links) {
                if (link.process(outputStream))
                    return true;
            }
            return false;
        }
        return false;
    }
}
