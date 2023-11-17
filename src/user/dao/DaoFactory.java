package user.dao;

import account.dao.AccountDao;
import message.dao.MessageDao;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import user.dao.daum.DConnectionMaker;

@Configuration
public class DaoFactory {
    /*
    * 팩토리의 메소드는 UserDao 타입의 오브젝트를 어떻게 만들고, 어떻게 준비시킬지를 결정한다.
    * */
    @Bean
    public UserDao userDao() {
        return new UserDao(connectionMaker());
    }

    @Bean
    public AccountDao accountDao() {
        return new AccountDao(connectionMaker());
    }

    @Bean
    public MessageDao messageDao() {
        return new MessageDao(connectionMaker());
    }

    @Bean
    public ConnectionMaker connectionMaker() {
        return new DConnectionMaker();
    }
}
