package commandPattern.requestLog;

public class Client {
    public static void main(String[] args) {
        ConfigSettingWindow configSettingWindow = new ConfigSettingWindow();
        Command command;
        ConfigOperator configOperator = new ConfigOperator();

        command = new InsertCommand("新增");
        command.setConfigOperator(configOperator);
        configSettingWindow.setCommand(command);
        configSettingWindow.call("homePage.html");

        command = new InsertCommand("新增");  // 用完即丢
        command.setConfigOperator(configOperator);
        configSettingWindow.setCommand(command);
        configSettingWindow.call("error.html");

        command = new UpdateCommand("修改");
        command.setConfigOperator(configOperator);
        configSettingWindow.setCommand(command);
        configSettingWindow.call("homePage.html");

        command = new UpdateCommand("修改");
        command.setConfigOperator(configOperator);
        configSettingWindow.setCommand(command);
        configSettingWindow.call("error.html");

        System.out.println("-------------------------");
        System.out.println("---------保存配置---------");
        configSettingWindow.save();
        System.out.println("-------------------------");
        System.out.println("---------回复配置---------");
        configSettingWindow.recover();
    }
}
