package light.rpc.user;

import light.rpc.consumer.param.Response;

public interface TestRemote {
	public Response testUser(User user);
}
