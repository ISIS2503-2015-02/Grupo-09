package security;

import be.objectify.deadbolt.core.models.Subject;
import be.objectify.deadbolt.java.AbstractDeadboltHandler;
import com.avaje.ebean.Model;
import models.User;
import play.libs.F;
import play.mvc.Http;
import play.mvc.Result;

/**
 * Created by ryogi on 3/11/15.
 */
public class MyDeadboltHandler   {

    //@Override
    public F.Promise<Result> beforeAuthCheck(Http.Context context) {
        return null;
    }

    //@Override
    public Subject getSubject(final Http.Context context) {
        User f = (User) new Model.Finder(User.class).byId(new Long(2));
        // in a real application, the user name would probably be in the session following a login process
        return f;
    }


    //@Override
    public F.Promise<Result> onAuthFailure(final Http.Context context,
                                           final String content) {
        // you can return any result from here - forbidden, etc
        //return F.Promise.promise(() -> ok(""));
        return null;

    }
}
