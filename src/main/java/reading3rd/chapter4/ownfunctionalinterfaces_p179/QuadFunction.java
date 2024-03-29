package reading3rd.chapter4.ownfunctionalinterfaces_p179;

@FunctionalInterface public interface QuadFunction<T,U,V,W,R> {
  R apply(T t, U u, V v, W w);
}
