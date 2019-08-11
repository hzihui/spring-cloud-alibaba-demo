package ribbonConfiguration;
import com.alibaba.cloud.nacos.ribbon.NacosRule;
import com.netflix.loadbalancer.IRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 负载均衡配置
 * @author HZI.HUI
 * @date 2019/7/17 22:36
 */
@Configuration
public class RibbonConfiguration{
    /**
     * 手动配置随机负载均衡
     * @return
     */
    @Bean
    public IRule iRule(){
        return new NacosRule();
    }
}
