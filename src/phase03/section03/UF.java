package phase03.section03;

/**
 * @author Created by sunjy on 3/22/25
 */
public interface UF {

    int getSize();

    boolean isConnected(int p, int q);

    void unionElements(int p, int q);

}
