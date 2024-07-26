package stepdefinition;

import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Stepdefinition {

	// for adaction hotel
	
	
	public static WebDriver driver;
	
	
	
	@Given("^user navigates to the Url$")
	public void user_navigates_to_the_Url() throws Throwable {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://adactinhotelapp.com/index.php");
		

	}
	


	@When("^user Enter The Username$")
	public void user_Enter_The_Username() throws Throwable {
		
		driver.findElement(By.id("username")).sendKeys("hema1892");
	}

	@When("^user Enter The Password$")
	public void user_Enter_The_Password() throws Throwable {
		
		driver.findElement(By.name("password")).sendKeys("123456");
	}

	@Then("^login must be successful$")
	public void login_must_be_successful() throws Throwable {
		
		driver.findElement(By.xpath("//input[@id='login']")).click();
	}
	
	
	@Given("^user navigates to the Select Hotel Url$")
	public void user_navigates_to_the_Select_Hotel_Url() throws Throwable {
		driver.navigate().to("https://adactinhotelapp.com/SearchHotel.php");
	}

	@When("^User Selects The Location$")
	public void user_Selects_The_Location() throws Throwable {
		WebElement location = driver.findElement(By.id("location"));
		Select select_location = new Select(location);
		select_location.selectByVisibleText("Sydney");
	}

	@When("^User Selects The Hotel$")
	public void user_Selects_The_Hotel() throws Throwable {
		WebElement hotels = driver.findElement(By.id("hotels"));
		Select select_hotels = new Select(hotels);
		select_hotels.selectByValue("Hotel Creek");
	}

	@When("^User Selects The Room Type$")
	public void user_Selects_The_Room_Type() throws Throwable {
		WebElement room = driver.findElement(By.name("room_type"));
		Select select_room = new Select(room);
		select_room.selectByValue("Deluxe");
	}

	@When("^User Selects The No Of Room$")
	public void user_Selects_The_No_Of_Room() throws Throwable {
		WebElement room_number = driver.findElement(By.name("room_nos"));
		Select select_room_number = new Select(room_number);
		select_room_number.selectByVisibleText("1 - One");
	}

	@When("^User Enters The Check In Date$")
	public void user_Enters_The_Check_In_Date() throws Throwable {
		driver.findElement(By.id("datepick_in")).sendKeys("10/07/2024");
	}

	@When("^User Enters The Check Out Date$")
	public void user_Enters_The_Check_Out_Date() throws Throwable {
		driver.findElement(By.id("datepick_out")).sendKeys("12/07/2024");

	}

	@When("^User Selects How Many Adults Present$")
	public void user_Selects_How_Many_Adults_Present() throws Throwable {
		WebElement adult = driver.findElement(By.name("adult_room"));
		Select select_adult = new Select(adult);
		select_adult.selectByVisibleText("3 - Three");}


	

	@When("^User Selects How Many Childern Present$")
	public void user_Selects_How_Many_Childern_Present() throws Throwable {
		WebElement child_room = driver.findElement(By.id("child_room"));
		Select select_child = new Select(child_room);
		select_child.selectByValue("1");
	}

	@Then("^Seach For Hotels$")
	public void seach_For_Hotels() throws Throwable {
		driver.findElement(By.xpath("//input[@value='Search']")).click();

	}
	
	@Given("^user navigates to the Url To Confirm The Hotel$")
	public void user_navigates_to_the_Url_To_Confirm_The_Hotel() throws Throwable {
		driver.navigate().to("https://adactinhotelapp.com/SelectHotel.php");
	}

	@When("^User Clicks The Hotel$")
	public void user_Clicks_The_Hotel() throws Throwable {
		WebElement click = driver.findElement(By.id("radiobutton_0"));
		click.click();
	}

	@Then("^User Clicks Continue Button$")
	public void user_Clicks_Continue_Button() throws Throwable {
		driver.findElement(By.xpath("//input[@id='continue']")).click();
	}

	
	
	
	
	@Given("^User navigates to the Book The Hotel$")
	public void user_navigates_to_the_Book_The_Hotel() throws Throwable {
		driver.navigate().to("https://adactinhotelapp.com/BookHotel.php");
	}

	@When("^User Types The First Name$")
	public void user_Types_The_First_Name() throws Throwable {
		driver.findElement(By.name("first_name")).sendKeys("ishwarya");
		
	}

	@When("^User Types The Last Name$")
	public void user_Types_The_Last_Name() throws Throwable {
		driver.findElement(By.name("last_name")).sendKeys("dhandaapani");
		
	}

	@When("^User Types The Billing Address$")
	public void user_Types_The_Billing_Address() throws Throwable {
		driver.findElement(By.id("address")).sendKeys("coimbatore");
		
	}

	@When("^User Types The Credit Card Number$")
	public void user_Types_The_Credit_Card_Number() throws Throwable {
		driver.findElement(By.id("cc_num")).sendKeys("1234567812345678");
	}

	@When("^User Selects The Credit Card Type$")
	public void user_Selects_The_Credit_Card_Type() throws Throwable {
		WebElement cc_type = driver.findElement(By.id("cc_type"));
		Select select_cc_type = new Select(cc_type);
		select_cc_type.selectByVisibleText("Master Card");
	}

	@When("^User Selects The Expiry Month$")
	public void user_Selects_The_Expiry_Month() throws Throwable {
		WebElement expiry_date = driver.findElement(By.id("cc_exp_month"));
		Select select_date = new Select(expiry_date);
		select_date.selectByVisibleText("October");
	}

	@When("^User Selects The Expiry Year$")
	public void user_Selects_The_Expiry_Year() throws Throwable {
		WebElement expiry_year = driver.findElement(By.id("cc_exp_year"));
		Select select_year = new Select(expiry_year);
		select_year.selectByVisibleText("2025");
	}

	@When("^User Types The Ccv Number$")
	public void user_Types_The_Ccv_Number() throws Throwable {
		driver.findElement(By.name("cc_cvv")).sendKeys("123");
		
	}

	@Then("^User Confirms The Booking$")
	public void user_Confirms_The_Booking() throws Throwable {
		WebElement element_by_id = driver.findElement(By.cssSelector("input#book_now"));
		element_by_id.click();
	}

	
	
}
