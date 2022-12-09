package run.halo.starter;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import run.halo.app.extension.AbstractExtension;
import run.halo.app.extension.GVK;

/**
 * @author ShrChang.Liu
 * @Date 2022/12/5
 **/
@Data
@EqualsAndHashCode(callSuper = true)
@GVK(group = "contact.halo.run", version = "v1alpha1",
        kind = "Contacts", plural = "contacts", singular = "contact")
public class ContactInfo extends AbstractExtension {

    private ContactSpec spec;

    @Data
    public static class ContactSpec {
        private String userName;
        private String phone;
        private String email;
        private String corpName;
        private String message;
    }
}
