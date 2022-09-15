package tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import Pages.Filters;
import Pages.HomePage;
import Pages.PageDetails;

public class tests extends BaseClass {
	
	
	@Test(priority = 1)
	public void checkTitlesWithFilters()  {
		
		HomePage homepage = new HomePage(driver);
		PageDetails moviePage = new PageDetails(driver);
		Filters filerPage = new Filters(driver);
	
		homepage.clickFilter();
		filerPage.clickAscending();
		filerPage.closeFilters();
		String titleFromHome =  homepage.getTitleHomePage();
		homepage.selectFirstMovieInList();
		String titleFromPageDetails = moviePage.getFirstMovieTitlePD();
		assertEquals(titleFromHome,titleFromPageDetails);	
		 moviePage.clickBackButton();
		 driver.quit();

	}
	
	@Test(priority = 2)
	public void checkTitlesWithoutFilter()  {
		
		HomePage homepage = new HomePage(driver);
		PageDetails moviePage = new PageDetails(driver);
		String titleFromHome =  homepage.getTitleHomePage();
		homepage.selectFirstMovieInList();
		String titleFromPageDetails = moviePage.getFirstMovieTitlePD();
		assertEquals(titleFromHome,titleFromPageDetails);	
		 moviePage.clickBackButton();	
	}
	
	
	@Test(priority = 3)
	//verify movies are filtered descending in vote average
	public void DchechFilters() {
		
		HomePage homepage = new HomePage(driver);
		Filters filerPage = new Filters(driver);
		PageDetails moviePage = new PageDetails(driver);

		homepage.clickFilter();
		filerPage.clickDescending();
		filerPage.clickVoteAverage();
		filerPage.closeFilters();
		homepage.selectFirstMovieInList();
		String movieRate =  moviePage.getMovieRate();
		
		moviePage.clickBackButton();

		assertEquals(movieRate, "10.0");
		
	}
	
	@Test(priority = 4)
	public void restButton()  {
		
		HomePage homepage = new HomePage(driver);
		Filters filerPage = new Filters(driver);

		homepage.clickFilter();
		filerPage.clickAscending();
		filerPage.clickResetButton();
	
		assertFalse(filerPage.isAscendingRadioButtonedChecked());
		assertTrue(filerPage.isDescendingRadioButtonedChecked());	
	}
}
	