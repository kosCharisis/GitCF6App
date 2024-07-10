package gr.aueb.cf.ch20.exer;

@FunctionalInterface
public interface IProductFilter {
    boolean filterId(Product product);
}
