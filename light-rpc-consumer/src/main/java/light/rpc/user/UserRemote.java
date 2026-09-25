package light.rpc.user;

import java.util.List;

import light.rpc.consumer.param.Response;


public interface UserRemote {
	public Response saveUser(User user);
	public Response saveUsers(List<User> userlist);
}
