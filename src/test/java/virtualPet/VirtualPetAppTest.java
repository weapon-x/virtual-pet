package virtualPet;
import org.junit.Assert;
import org.junit.Test;

import virtualPet.VirtualPetApp;

public class VirtualPetAppTest
{
	VirtualPetApp vPetApp = new VirtualPetApp();
	
	@Test
	public void shouldReturnTrueWhenValidUserMenuResponse()
	{
		String testUserMenuChoice = "4";
		boolean testIsValidResponse = VirtualPetApp.isValidUserReponse(testUserMenuChoice);
		Assert.assertEquals(true, testIsValidResponse);
	}
}
