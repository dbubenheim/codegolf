package codesignal;

import java.util.List;

public class EquilibriumPoint {

    public int equilibriumPoint(List<Integer> a) {
        var c = 0;
        var b = a.stream().mapToInt(x -> x).sum();
        for (var x : a) b += x;
        var i = 0;
        for (var x : a) {
            b -= x;
            if (c == b) return ++i;
            c += x;
            i++;
        }
        return -1;
    }
}
