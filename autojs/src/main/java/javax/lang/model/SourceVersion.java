package javax.lang.model;

/**
 * @author Shenben
 * @date 2022/9/5 17:28
 * @description
 * @since
 */
public class SourceVersion {

    public static SourceVersion latestSupported() {
        return new SourceVersion();
    }

    public final int ordinal() {
        return 8;
    }
}
