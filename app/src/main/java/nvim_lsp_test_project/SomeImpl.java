package nvim_lsp_test_project;

import java.util.Arrays;
import java.util.stream.Collectors;

public class SomeImpl implements SomeInterface {
    private static String foo;
    public Bar foo2;
    /*
     * Multi multi
     * line line
     */
    private External ext;

    // comenting comment
    private record Bar(int a, SomeInterface b){}



    /**
     * Javadoc is a thing.
     *
     * That people use
     * */
    @Override
    public void foo() {
        System.out.println("bar");
        var q = ext.getFoo();
        Long q2 = ext.foo;

        long z = q + q2;
        Arrays.asList("a","b","c").stream().map(r-> r+z).collect(Collectors.toList());
    }
}
