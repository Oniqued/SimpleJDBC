package account.dao;

import user.dao.ConnectionMaker;

import java.sql.Connection;

public class AccountDao {
    private ConnectionMaker connectionMaker;

    public AccountDao(ConnectionMaker connectionMaker) {
        this.connectionMaker = connectionMaker;
    }
}
