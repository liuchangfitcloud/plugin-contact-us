package run.halo.starter.finders.impl;

import reactor.core.publisher.Mono;
import run.halo.app.core.extension.Plugin;
import run.halo.app.extension.ReactiveExtensionClient;
import run.halo.app.plugin.SettingFetcher;
import run.halo.app.theme.finders.Finder;
import run.halo.starter.finders.ContactUsFinder;

/**
 * 可能也用不到吧
 * @author ShrChang.Liu
 * @Date 2022/12/5
 **/
@Finder("contactUsFinder")
public class ContactUsFinderImpl implements ContactUsFinder {

    private final ReactiveExtensionClient client;

    public ContactUsFinderImpl(ReactiveExtensionClient client) {
        this.client = client;
    }

    public void test(){
        Mono<Plugin> plugin = client.get(Plugin.class,"PluginContactUs");
    }
}
