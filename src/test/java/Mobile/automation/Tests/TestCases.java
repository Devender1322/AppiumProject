package Mobile.automation.Tests;
import java.io.IOException;

import org.testng.annotations.*;
import Mobile.automation.pageObject.AutoConnectAudioPage;
import Mobile.automation.pageObject.HomePageAfterLogin;
import Mobile.automation.pageObject.InBoxForSelf;
import Mobile.automation.pageObject.MeetingsSettingWithoutLogin;
import Mobile.automation.pageObject.SettingsPage;
import Mobile.automation.pageObject.SignInPage;
import Mobile.automation.pageObject.Starred;
import Mobile.automation.pageObject.TeamChatClass;
import Mobile.automation.pageObject.WelcomePage;
import Mobile.automation.utilitise.Readconfig;


public class TestCases extends BeforeAfterBaseClass {
	@Test 
	//                                                                                 Completed
	public void TC01() throws IOException {             
		WelcomePage wp = new WelcomePage(LocalDriver);
		SettingsPage sp = new SettingsPage(LocalDriver);
		MeetingsSettingWithoutLogin mp = new MeetingsSettingWithoutLogin(LocalDriver);
		AutoConnectAudioPage ap = new AutoConnectAudioPage(LocalDriver);
		test=reports.createTest("First test case");	
		wp.clickSettingbutton();
		sp.ClickMeetingsButton();
		Takescreenshot();
		mp.ClickAutoConnectAudio();
		ap.ClickPanel_internet();
	}
	@Test
	public void TC02() {
		WelcomePage wp = new WelcomePage(LocalDriver);
		SignInPage sp = new SignInPage(LocalDriver);
		test=reports.createTest("Second test case");
		wp.clickSignIn();
		sp.EnterEmailid();
		sp.EnterPassword();
		sp.ClickSignInBtn();
		sp.ClickbtnNotnow();
		sp.ClickbtnGetStart();
		logs.info("User is on Homepage");
	}
	@Test 
	public void TC03() {
		WelcomePage wp = new WelcomePage(LocalDriver);
		SignInPage sp = new SignInPage(LocalDriver);
		HomePageAfterLogin hp = new HomePageAfterLogin(LocalDriver);
		TeamChatClass tp = new TeamChatClass(LocalDriver);
		test=reports.createTest("Third test case");
		wp.clickSignIn();
		sp.EnterEmailid();
		sp.EnterPassword();
		sp.ClickSignInBtn();
		sp.ClickbtnNotnow();
		sp.ClickbtnGetStart();
		hp.ClickTeamChatTab();
		logs.info("Clicked on Team chat button");
		tp.ClickimgFilterIcon();
		tp.ClickSelectMention();
		tp.ClickimgFilterCancel();
		tp.ClickimgFilterIcon();
		tp.ClickSelectDirectMessage();
		tp.ClickimgFilterCancel();
		tp.ClickimgFilterIcon();
		tp.ClickSelectUnread();
		tp.ClickimgFilterCancel();
		tp.ClickimgFilterIcon();
		tp.ClickSelectMuted();
		tp.ClickimgFilterCancel();
		
	}
	
	@Test
	public void TC04(){
		WelcomePage wp = new WelcomePage(LocalDriver);
		SignInPage sp = new SignInPage(LocalDriver);
		HomePageAfterLogin hp = new HomePageAfterLogin(LocalDriver);
		TeamChatClass tp = new TeamChatClass(LocalDriver);
		Starred stp = new Starred(LocalDriver);
		InBoxForSelf ip = new InBoxForSelf(LocalDriver);		
		test=reports.createTest("Forth test case");
		wp.clickSignIn();
		sp.EnterEmailid();
		sp.EnterPassword();
		sp.ClickSignInBtn();
		sp.ClickbtnNotnow();
		sp.ClickbtnGetStart();
		hp.ClickTeamChatTab();
		tp.ClickStarred();
		stp.clickChat();
		ip.clickChatTextField();
		ip.clickChatSendBtn();
	}
	
	@Test
	public void TC05() throws IOException  {             
		WelcomePage wp = new WelcomePage(LocalDriver);
		SettingsPage sp = new SettingsPage(LocalDriver);
		MeetingsSettingWithoutLogin mp = new MeetingsSettingWithoutLogin(LocalDriver);
		wp.clickSettingbutton();
		sp.ClickMeetingsButton();
		mp.EnableAutoMuteAudio();
		mp.EnableCheckOriginalAudio();
		mp.EnableTurnOffMyVideo();
		mp.ScrollToSkin();
		mp.ClickReactionSkinTone();
		mp.SelectSkinToneDark();
		LocalDriver.navigate().back();
		
		
}
}
