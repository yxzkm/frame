package com.zhangkm.auth;


/**
 * 错误信息枚举类型
 * @ClassName: Error
 * @Description: TODO
 *
 */
public enum Code {
    /**
     * 成功
     */
    OK(0, "成功"),
    
    /**
     * 参数为空
     */
    EMPTY_PARAMETER_ERROR(1001, "参数为空"),
    
    /**
     * 没有操作权限，拒绝访问
     */
    ACCESS_DENIED(1002, "没有操作权限，拒绝访问"),
    /**
     * 参数不符合要求
     */
    FORMAT_ERROR(1003,"参数不符合要求"),  
   /**
    * 该账户未登录
    */
    NOT_LOGGED(1004,"该账户未登录"),
    
    /**
     * 手机号格式不正确
     */
    MOBILE_FORMAT_ERROR(2001, "手机号格式不正确"),
    
    /**
     * 手机号已被占用
     */
    MOBILE_INUSE_ERROR(2002, "手机号已被占用"),
 
    
    /**
     * 发送注册短信验证码失败
     */
    MSM_FOR_REGISTER_SEND_ERROR(2003, "发送注册短信验证码失败"),
    
    /**
     * 图片验证码不正确
     */
    CAPTCHA_ERROR(2004, "图片验证码不正确"),
    
    /**
     * 短信验证码不正确
     */
    MSM_INPUT_ERROR(2005, "短信验证码不正确"),
    
    /**
     * 账号注册失败
     */
    REGISTER_ERROR(2006, "账号注册失败"),
    /**
     * 短信验证码不正确
     */
    MSM_REALNAME_ERROR(2007, "手机号和真实姓名不匹配"),
    
    /**
     * 用户不存在
     */
    USER_NOT_EXIST(3001, "用户不存在"),
    
    /**
     * 密码不正确
     */
    PASSWORD_INCORRECT(3002, "密码不正确"),
    
    /**
     * 当前用户状态不正确
     */
    USER_STATUS_INCORRECT(3003, "当前用户状态不正确"),
    
    /**
     * 用户登录的系统不存在或未授权登录
     */
    APPLICATION_NOT_EXIST_OR_FORBIDDEN_LOGIN(3004, "用户登录的系统不存在或未授权登录"),
    
    /**
     * invalid_request
     */
    INVALID_REQUEST(3005, "invalid_request"),
    
    /**
     * invalid_code
     */
    INVALID_CODE(3006, "invalid_code"),
    /**
     * 该账户已被占用
     */
    ACCOUNT_INUSE_ERROR(3007,"该账户已被占用"),
    
    /**
     * 该账户已被占用
     */
    USER_LOGOUT(3008,"用户已登出或超时退出"),
    
    /**
     * tokenCode不正确
     */
    TOKEN_CODE_INVALID(3009,"tokenCode不正确或已过期"),
    


    /**
     * 未知手机号，无法修改密码
     */
    UNKNOWN_MOBILE_CANNOT_RESET_PASSWORD(4001, "未知手机号，无法修改密码"),
    
    /**
     * 发送重置密码短信验证码失败
     */
    MSM_FOR_RESET_PASSWORD_SEND_ERROR(4002, "发送重置密码短信验证码失败"),
    
    /**
     * 重置密码失败
     */
    RESET_PASSWORD_ERROR(4003, "重置密码失败"),

    /**
     * 新增应用系统失败
     */
    ADD_APPLICATION_FAIL(5001, "新增应用系统失败"),

    /**
     * 删除应用系统失败
     */
    DELETE_APPLICATION_FAIL(5002, "删除应用系统失败"),
    
    /**
     * 应用中文名称不唯一失败
     */
    APPLICATION_NAME_CHINESE_NOT_UNIQUE(5003, "应用中文名称不唯一"),
    
    /**
     * 应用英文名称不唯一失败
     */
    APPLICATION_NAME_ENGLISH_NOT_UNIQUE(5004, "应用英文名称不唯一"),
    
    /**
     * 应用简称不唯一失败
     */
    APPLICATION_NAME_ALIAS_NOT_UNIQUE(5005, "应用简称不唯一"),
    
    /**
     * 应用回调地址不唯一失败
     */
    APPLICATION_MESSAGE_HANDLER_NOT_UNIQUE(5006, "应用回调地址不唯一"),

    /**
     * 用户删除失败
     */
    USER_DELETE_FAILURE(6001, "用户删除失败"),
    
    /**
     * 用户禁用失败
     */
    USER_FORBIDDEN_FAILURE(6002, "用户禁用失败"),
    
    /**
     * 用户启用失败
     */
    USER_UNFORBIDDEN_FAILURE(6003, "用户启用失败"),
    
    /**
     * 用户绑定组织机构失败
     */
    USER_BIND_CORP_FAILURE(6004, "用户绑定组织机构失败"),
    
    /**
     * 解除用户和组织机构绑定关系失败
     */
    USER_UNBIND_CORP_FAILURE(6005, "解除用户和组织机构绑定关系失败"),
    /**
     * 用户添加失败
     */
    USER_ADD_FAILURE(6006, "用户添加失败"),
    /**
     * 用户更新失败
     */
    USER_UPDATE_FAILURE(6007, "用户更新失败"), 
    /**
     * 用户微信解绑失败
     */
    USER_UNBINDWEIXIN_FAILURE(6008, "用户微信解绑失败"), 
    /**
     * 用户企业解绑失败
     */
    RELIEVE_IDENTITY_FAILURE(6009, "用户企业解绑失败"),
       /**
     * 手机号已被占用
     */
    EMAIL_INUSE_ERROR(6010, "邮箱已被占用"),
     /**
     * 用户未绑定企业
     */
    USER_NOBIND_ETR(6011, "用户未实名认证"),
    /**
     *企业地区代码更新失败
     */
    UPDATE_LOCATION_FAIL(6012, "企业地区代码更新失败"),
    /**
     * 该银行已经存在
     */
    HAS_EXISTED(6013,"该银行已经存在"),
    /**
     * 银行名字冲突
     */
    BANKNAME_CONFLICT(6014,"银行名字冲突"),
    
    /**
     * 所选银行地区为空
     */
    BANKREGION_EMPTY(6015,"所选银行地区为空"),
    /**
     * 该分行地区与其他分行有冲突
     */
    BANKREGION_CONFLICT(6016,"该分行地区与其他分行有冲突"),
    /**
     * 银行不能为空
     */
    BANK_EMPTY(6017,"银行不能为空"),
    /**
     * 获取分行地区异常，请重新获得
     */
    AREAEMPTY_EXCEPTION(6018,"获取分行地区异常，请重新获得"),
    /**
     * 所选站点不能为空
     */
    SITE_EMPTY(7001,"所选站点不能为空"),
    /**
     * 站点名字不能为空
     */
    SITENAME_EMPTY(7002,"站点名字不能为空"),
    /**
     * 站点名字不能重复
     */
    SITE_HAS_EXISTED(7003,"站点名字不能重复"),
    /**
     * 该站点地区与其他站点有冲突
     */
    SITEREGION_CONFLICT(7004,"该站点地区与其他站点有冲突"),
    /**
     * 获取站点异常，请重新获得
     */
    SITEEMPTY_EXCEPTION(7005,"获取站点异常，请重新获得"),
    /**
     * 该用户异常，请管理员审查
     */
    SYSUSER_EXCEPTION(8001,"该用户异常，请管理员审查"),
    /**
     * 该用户已经是本类型用户，可以修改
     */
    SYSUSER_SAME(8002,"可以修改"),
    /**
     * 该站点用户已经是其他类型，不能添加
     */
    SYSUSER_NOT_SAME(8003,"不能添加"),
    /**
     * 用户站点不能为空
     */
    USERSITE_EMPTY(8004,"用户站点为空异常"),

    /**
     * 新用户
     */
    SYSUSER_NEW(8005,"新用户"),
    
    /**
     * 用户所属银行不能为空
     */
    USERBANK_EMPTY(8006,"用户所属银行不能为空"),
    
    
    /**
     * 上传文件为空
     */
    FILE_EMPTY(9001,"上传文件为空"),
    
    /**
     * 上传文件异常
     */
    FILE_EXCE(9002,"上传文件异常"),
    
    /**
     * 爱税宝返回的code有误
     */
    ERROR_ASB_CODE(9003,"爱税宝返回code错误"),
    
    /**
     * 爱税宝返回的数据格式有误
     */
    ERROR_ASB_DATA(9004,"爱税宝返回的data格式错误"),
    
    /**
     * 爱税宝返回的企业已经存在
     */
    DUP_ENTER_INFO(9005,"爱税宝返回的企业已经存在"),
    
    /**
     * 纳税人识别号格式不正确或无法获取纳税人识别号所代表的行政区划
     */
    ERROR_TAX_CODE(9006,"纳税人识别号格式不正确或无法获取纳税人识别号所代表的行政区划"),
    
    /**
     * 新增企业失败
     */
    ERROR_INSERT_ENTER(9007,"新增企业失败"),

    
    
    /**************************************************************************/
    /**
     * 未知错误
     */
    UNKNOWN_ERROR(9999,"未知错误");
    
    /**
     * 错误代码
     */
    
    private final int code;

    
    /**
     * 错误信息
     */
    private final String msg;

    private Code(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }
    
    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

}
