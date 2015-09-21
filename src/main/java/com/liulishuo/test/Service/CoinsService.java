package com.liulishuo.test.Service;

import com.liulishuo.test.Model.Coins;
import org.springframework.stereotype.Service;

/**
 * Created by Arthur on 2015/9/21.
 */
@Service
public interface CoinsService {
    int getCoinsByUserId(Integer userId);

    int addUser(int userId,int coins);

    boolean transfer(int inUserId,int outUserId,int coins);
}
