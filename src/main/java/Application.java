import org.apache.calcite.plan.RelOptUtil;
import org.apache.calcite.rel.RelNode;
import org.apache.calcite.tools.FrameworkConfig;
import org.apache.calcite.tools.RelBuilder;

public class Application {

    public static void main(String[] args)  {
        final FrameworkConfig config = null; //new FrameworkConfig();
        final RelBuilder builder = RelBuilder.create(config);
        final RelNode node = builder
                .scan("EMP")
                .build();
        System.out.println(RelOptUtil.toString(node));
    }
}
