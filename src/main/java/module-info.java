module dev.mccue.guava.net {
    requires static com.google.errorprone.annotations;
    requires static dev.mccue.jsr305;
    requires static org.checkerframework.checker.qual;

    requires transitive dev.mccue.guava.base;
    requires transitive dev.mccue.guava.escape;
    requires transitive dev.mccue.guava.collect;
    requires dev.mccue.guava.io;
    requires dev.mccue.guava.primitives;

    exports dev.mccue.guava.net;
}