package ESR;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import resources.base;

public class MultipleSitesLogin228 extends base {
	
	WebDriver driver;
	@BeforeTest
	public void initialize() throws IOException
	{
		driver =initializeDriver();
	}
	
	@Test(dataProvider="data-provider")
	public void multipleSites(String url) 
	{
		driver.get(url);
		
		new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.id("loginUsername")));
		System.out.println("Page successfully loaded for "+ url);
		}
		
		/*String currentUrld = driver.getCurrentUrl();
		if (url.equalsIgnoreCase(currentUrld)) {
			
			System.out.println("The "+ url + "landed on the correct page");
		}
		else System.out.println("Something is wrong with "+ url + "Please check it!");
	}*/
	
		
	@AfterTest
	public void teardown () {
		driver.close();
	}
	
		

@DataProvider(name ="data-provider")
public Object[][] urldataProviderMethod() {
return new Object[][] { 
	{"https://www.007reports.com/"},
	{"https://www.absolutewaterreports.com/"},
	{"https://www.accoesreports.com/"},
	{"https://www.accowt.com/"},
	{"https://www.actservicereports.com/"},
	{"https://www.afcoreports.com/"},
	{"https://www.aimsreports.com/"},
	{"https://www.alphachemicalreports.com/"},
	{"https://www.alphalabsreports.com/"},
	{"https://www.apollotecservicereports.com/"},
	{"https://www.Apollowaterreports.com/"},
	{"https://www.aqtdata.com/"},
	{"https://www.aqua-analytics-login.com/"},
	{"https://www.aqua-reports.com/"},
	{"https://www.aquachemservice.eu/"},
	{"https://www.aquaclearreports.com/"},
	{"https://www.aqualabsreports.com/"},
	{"https://www.aquamanager.co.uk/"},
	{"https://www.aquaphasereports.com/"},
	{"https://www.aquarapport.com/"},
	{"https://www.aquarianchemicalreports.com/"},
	{"https://www.aquatechonline.co.uk/"},
	{"https://www.aquatrolreports.com/"},
	{"https://www.aquavyp.tech/"},
	{"https://www.ariesreport.com/"},
	{"https://www.asereports.com/"},
	{"https://www.aswcreports.com/"},
	{"https://www.atomwatertreatment.com/"},
	{"https://www.awcreports.com/"},
	{"https://www.awgreports.com/"},
	{"https://www.awsreporting.com/"},
	{"https://www.awsreports.com/"},
	{"https://www.awtereports.com/"},
	{"https://www.barclaystar.com/"},
	{"https://www.BasinWaterLogix.com/"},
	{"https://www.bereports.com/"},
	{"https://www.bhiservicereports.com/"},
	{"https://www.bicereports.com/"},
	{"https://www.bkreports.com/"},
	{"https://www.bluetechreports.com/"},
	{"https://www.brownelabsreports.com/"},
	{"https://www.cannonwaterereport.com/"},
	{"https://www.captureh2oreports.com/"},
	{"https://www.ccichemicalreports.com/"},
	{"https://www.cewaterreports.com/"},
	{"https://www.ch2oreports.com/"},
	{"https://www.chemcoereports.com/"},
	{"https://www.chemreadyservice.com/"},
	{"https://www.chemstar-reports.com/"},
	{"https://www.chemstreamtracker.com/"},
	{"https://www.chemsysreports.com/"},
	{"https://www.chemsystemshireports.com/"},
	{"https://www.chemtekscreports.com/"},
	{"https://www.chemtexreports.com/"},
	{"https://www.chemtronreports.com/"},
	{"https://www.claritywatchman.com/"},
	{"https://www.clearwaterreports.com/"},
	{"https://www.coastlineltdreports.com/"},
	{"https://www.commercialchemtechreports.com//"},
	{"https://www.controlchemconnects.com/"},
	{"https://www.crimsonchemicalsreports.com/"},
	{"https://www.csctechreports.com/"},
	{"https://www.csi-solution.ca/"},
	{"https://www.cssireports.com/"},
	{"https://www.csusawaterreports.com/"},
	{"https://www.cwtreports.com/"},
	{"https://www.dataguard.app/"},
	{"https://www.dbwaterreports.com/"},
	{"https://www.dkreports.com/"},
	{"https://www.dlcloudreports.com/"},
	{"https://www.duboisservice.com/"},
	{"https://www.eagleservicereports.com/"},
	{"https://www.earthwisereports.com/"},
	{"https://www.ecowaterlab-reports.com/"},
	{"https://www.ehydroreports.com/"},
	{"https://www.ekopakreports.com/"},
	{"https://www.enerstarreports.com/"},
	{"https://www.entechwatertreatment.com/"},
	{"https://www.equichemtechcorp.com/"},
	{"https://www.ereportssopura.com/"},
	{"https://www.esservicesolution.com/"},
	{"https://www.esummitreports.com/"},
	{"https://www.evergreendatasolutions.com/"},
	{"https://www.ewacon.com/"},
	{"https://www.ewero.net/"},
	{"https://www.experiencedwaterreports.com/"},
	{"https://www.fbsreports.com/"},
	{"https://www.fctwaterreports.com/"},
	{"https://www.fossewaterwatcher.uk/"},
	{"https://www.fremont-elink.com/"},
	{"https://www.g-chemereports.com/"},
	{"https://www.glaserservicereports.com/"},
	{"https://www.glawaterconsultants.com/"},
	{"https://www.glawaterreports.com/"},
	{"https://www.gothamh2o.com/"},
	{"https://www.greenwaterreports.com/"},
	{"https://www.greenwaychemreports.com/"},
	{"https://www.gtgsr.com/"},
	{"https://www.guardianreports.com/"},
	{"https://www.gurneyreports.com/"},
	{"https://www.gwaterreports.com/"},
	{"https://www.gwt-reports.com/"},
	{"https://www.h2gsservice.com/"},
	{"https://www.h2oereports.com/"},
	{"https://www.h2oengreports.com/"},
	{"https://www.halreports.com/"},
	{"https://www.hcreports.com/"},
	{"https://www.hoffmanconnect.com/"},
	{"https://www.hohreports.com/"},
	{"https://www.hpereports.com/"},
	{"https://www.hydrexetrend.co.uk/"},
	{"https://www.hydrocon-cloudservices.com/"},
	{"https://www.hydrodynamicsservicereport.com/"},
	{"https://www.hydro-zoneereports.com/"},
	{"https://www.ibhlabsreport.com/"},
	{"https://www.ihsreports.com/"},
	{"https://www.ionwateranalytics.com/"},
	{"https://www.isbwatertreatment.com/"},
	{"https://www.isiwaterreports.com/"},
	{"https://www.isogreports.com/"},
	{"https://www.itoh2reports.com/"},
	{"https://www.iweservice.com/"},
	{"https://www.iwm-ireports.com/"},
	{"https://www.iwtcvision.com/"},
	{"https://www.iwteservicereports.com/"},
	{"https://www.jaytechreports.com/"},
	{"https://www.jpchmh2o.com/"},
	{"https://www.jutziwater.com/"},
	{"https://www.kemitechreports.eu/"},
	{"https://www.keytechservice.com/"},
	{"https://www.klenzoidreports.com/"},
	{"https://www.korn-eservice.com/"},
	{"https://www.kroffservicereports.com/"},
	{"https://www.kurita-elink.com/"},
	{"https://www.kwtereports.com/"},
	{"https://www.lamottewatermanagement.com/"},
	{"https://www.lcsnyc.net/"},
	{"https://www.levelmonitoring.com/"},
	{"https://www.limbachwt.com/"},
	{"https://www.lombardiservicereports.com/"},
	{"https://www.maewaterreports.com/"},
	{"https://www.mchemreports.com/"},
	{"https://www.metroservicereports.com/"},
	{"https://www.mhwtec-reports.com/"},
	{"https://www.miuracanadasolutions.com/"},
	{"https://www.mwtreports.com/"},
	{"https://www.myawcwaterreports.com/"},
	{"https://www.myscireports.com/"},
	{"https://www.myswtreports.com/"},
	{"https://www.mywtsreports.com/"},
	{"https://www.nashchemreports.com/"},
	{"https://www.nwsreports.com/"},
	{"https://www.nwtreports.com/"},
	{"https://www.onesourcegateway.com/"},
	{"https://www.pace-ecoreports.com/"},
	{"https://www.paceinsite.com/"},
	{"https://www.paceservicereports.com/"},
	{"https://www.parafoslog.com/"},
	{"https://www.pecoreports.com/"},
	{"https://www.pfsportal.com/"},
	{"https://www.precisionchemreports.com/"},
	{"https://www.proasysservice.com/"},
	{"https://www.ptiwater-reports.com/"},
	{"https://www.pwetreports.com/"},
	{"https://www.pwmereports.com/"},
	{"https://www.qvlink.net/"},
	{"https://www.r2jreports.com/"},
	{"https://www.rameaservices.com/"},
	{"https://www.reportespqi.com/"},
	{"https://www.rkwatertesting.com/"},
	{"https://www.rmcorp-reports.com/"},
	{"https://www.sbtservicereports.com/"},
	{"https://www.sci-reports.com/"},
	{"https://www.seacoreports.com/"},
	{"https://www.selreports.com/"},
	{"https://www.sensysereports.co.uk/"},
	{"https://www.sentryreports.com/"},
	{"https://www.sestreatment.com/"},
	{"https://www.shepardbrosreports.com/"},
	{"https://www.sjcstar.com/"},
	{"https://www.skasolreports.com/"},
	{"https://www.solutrol.com/"},
	{"https://www.sscreports.com/"},
	{"https://www.sswreports.com/"},
	{"https://www.steam-coreport.com/"},
	{"https://www.steamreports.com/"},
	{"https://www.swesmartreports.com/"},
	{"https://www.swtreports.com/"},
	{"https://www.syntecreports.com/"},
	{"https://www.tdcjeservice.com/"},
	{"https://www.tensio-eservices.com/"},
	{"https://www.tgwtexpertise.com/"},
	{"https://www.theguardianshield.com/"},
	{"https://www.thetranestation.com/"},
	{"https://www.tmbservicereport.com/"},
	{"https://www.towerwm.com/"},
	{"https://www.trgereports.com/"},
	{"https://www.triplepointreports.com/"},
	{"https://www.tsswaterreports.com/"},
	{"https://www.tustinwaterreports.com/"},
	{"https://www.veoliavisionna.com/"},
	{"https://www.visentiareports.com/"},
	{"https://www.wallingreports.com/"},
	{"https://www.waltechreports.com/"},
	{"https://www.walterlouisreports.com/"},
	{"https://www.waterengineeringreports.com/"},
	{"https://www.watermanagementsvc.com/"},
	{"https://www.wateronereports.com/"},
	{"https://www.watersmartrx.com/"},
	{"https://www.watertechinfo.com/"},
	{"https://www.watertechreports.com/"},
	{"https://www.watertreatmentbydesignreports.com/"},
	{"https://www.waterwideonline.com/"},
	{"https://www.wcareports.com/"},
	{"https://www.weasreports.com/"},
	{"https://www.wellswaterreports.com/"},
	{"https://www.wemreporting.com/"},
	{"https://www.wesmarreports.com/"},
	{"https://www.west-reports.com/"},
	{"https://www.westernwaterreports.com/"},
	{"https://www.wetsolutionsinccsr.com/"},
	{"https://www.whohreports.com/"},
	{"https://www.wsnwereports.com/"},
	{"https://www.wteservice.com/"},
	{"https://www.wwtreports.com/"},
	{"https://www.xelera-eservice.com/"},
	{"https://www.zeeclientportal.com/"}};
	}}



