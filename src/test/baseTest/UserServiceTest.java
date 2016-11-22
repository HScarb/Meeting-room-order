package baseTest;

import com.mtr.model.User;
import com.mtr.service.UserService;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Scarb's Surface on 11/22/2016.
 */
public class UserServiceTest extends SpringTestCase {

    Logger logger = Logger.getLogger(UserServiceTest.class);
    @Autowired
    private UserService userService;

    @Test
    public void selectUserByIdTest()
    {
        User user = userService.selectUserById(1);
        logger.debug("查找结果: " + user.getName());
    }
}
