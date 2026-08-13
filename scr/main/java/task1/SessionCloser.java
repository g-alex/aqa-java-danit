package task1;

import java.util.List;

@FunctionalInterface

public interface SessionCloser {
    void closeSession(List<CanBeClosed> entities);
}
