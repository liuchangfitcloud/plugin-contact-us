package run.halo.starter;

import org.pf4j.PluginWrapper;
import org.springframework.stereotype.Component;
import run.halo.app.extension.SchemeManager;
import run.halo.app.plugin.BasePlugin;

/**
 * 联系我们
 * @author shrchang.Liu
 * @since 2.0.0
 */
@Component
public class ContactUsPlugin extends BasePlugin {

    private final SchemeManager schemeManager;

    public ContactUsPlugin(PluginWrapper wrapper,SchemeManager schemeManager) {
        super(wrapper);
        this.schemeManager = schemeManager;
    }

    @Override
    public void start() {
        schemeManager.register(ContactInfo.class);
        System.out.println("插件[联系我们]启动成功！");
    }

    @Override
    public void stop() {
        schemeManager.unregister(schemeManager.get(ContactInfo.class));
        System.out.println("插件[联系我们]停止！");
    }
}
