package pattern.facade;

import lombok.Data;

/**
 * Created by lby on 2018/9/6.
 */
@Data
public class ConfigModel {
    private boolean isNeedPresentation;
    private boolean isNeedDao;
    private boolean isNeedBuss;
}
