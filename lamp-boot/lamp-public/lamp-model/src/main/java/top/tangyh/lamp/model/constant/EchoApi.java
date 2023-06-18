package top.tangyh.lamp.model.constant;

/**
 * 仅仅用于记录 RemoteField 注解相关的 接口和方法名称
 * <p>
 * 切记，该类下的接口和方法，一定要自己手动创建，否则会注入失败
 *
 * @author zuihou
 * @date 2020年01月20日11:16:37
 */
public interface EchoApi {
    // @lamp.generator auto insert EchoApi

    /**
     * 数据字典项 feign查询类 全类名
     */
    String DICTIONARY_ITEM_FEIGN_CLASS = "top.tangyh.lamp.common.api.DictionaryApi";
    /**
     * 数据字典项 service查询类
     */
    String DICTIONARY_ITEM_CLASS = "dictionaryServiceImpl";

    /**
     * 组织 service查询类
     */
    String ORG_ID_CLASS = "orgServiceImpl";
    /**
     * 组织 feign查询类
     */
    String ORG_ID_FEIGN_CLASS = "top.tangyh.lamp.common.api.OrgApi";

    /**
     * 用户 service查询类
     */
    String USER_ID_CLASS = "userServiceImpl";
    /**
     * 用户 feign查询类
     */
    String USER_ID_FEIGN_CLASS = "top.tangyh.lamp.common.api.UserApi";

    /**
     * 组织 service查询类
     */
    String STATION_ID_CLASS = "stationServiceImpl";
    /**
     * 组织 feign查询类
     */
    String STATION_ID_FEIGN_CLASS = "top.tangyh.lamp.common.api.StationApi";

    /**
     * 短信模板 service查询类
     */
    String SMS_TEMPLATE_ID_CLASS = "smsTemplateServiceImpl";

}
