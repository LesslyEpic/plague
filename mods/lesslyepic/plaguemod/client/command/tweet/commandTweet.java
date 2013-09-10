package mods.lesslyepic.plaguemod.client.command.tweet;

import mods.lesslyepic.plaguemod.common.stringColor;
import net.minecraft.command.CommandBase;
import net.minecraft.command.ICommandSender;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.auth.AccessToken;

public class commandTweet extends CommandBase{

	String consumerKey = "";
	String consumerSecret = "";
	String accessToken = "";
	String accessTokenSecret = "";
	
	boolean successful;
	
	public commandTweet (String consumerKey,String consumerSecret ,String accessToken,String accessTokenSecret) {
		
		this.consumerKey = consumerKey;
		this.consumerSecret = consumerSecret;
		this.accessToken = accessToken;
		this.accessTokenSecret = accessTokenSecret;
	}
	@Override
	public String getCommandName() {
		//Execution name. e.g /tweet
		return "tweet";
	}

	@Override
	public String getCommandUsage(ICommandSender icommandsender) {
		return "/tweet [message]";
	}

	@Override
	public void processCommand(ICommandSender icommandsender, String[] astring) {
		Twitter twitter = new TwitterFactory().getInstance();
		twitter.setOAuthConsumer(consumerKey, consumerSecret);
		twitter.setOAuthAccessToken(new AccessToken(accessToken, accessTokenSecret));
		
	if(astring.length > 0)
	{
		String message = "";
		
		for (String s: astring)
		{
			message += s + " ";	
		}
		try
		{
			successful = true;
			twitter.updateStatus(message);
		}
		catch(TwitterException ex)
		{
			successful = false;
		}
	}
	if (successful == true)
		{
		Utilities.SendChat(icommandsender, stringColor.light_green + "Tweet sent successfully.");	
		}
	else
	{
		Utilities.SendChat(icommandsender, stringColor.dark_red + "Tweet was not sent successfully. Please check configuration files for API tokens.");
	}
	}
}