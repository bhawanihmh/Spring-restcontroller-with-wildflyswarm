package bss.tv.it;

import java.util.List;

/**
 * @author bhawani.singh
 * @since 27/01/17
 */
public class Log {

    private final List<String> lines;

    public Log(List<String> lines) {
        this.lines = lines;
    }

    public List<String> getLines() {
        return this.lines;
    }
}
