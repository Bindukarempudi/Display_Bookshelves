	Hackathon Project 
	======================================================================================
	 
	Problem Statement : Display Bookshelves
	--------------------------------------------------------------------------------------
	 
	Display the name, price of
	1. Bookshelves below Rs. 15000 
	2. Including out of stock
	3. Storage type should be open.
	3. Take first 3 study chair details with highest recommendation
	If more than one item with same price displayed, include that details as well.
	(Suggested site: urbanladder.com  however you are free to use any other legitimate site)
		 
	---------------------------------------------------------------------------------------	 
	Detailed Description : Hackathon Project
	---------------------------------------------------------------------------------------
	 
	1. Display the name & price of first 3 Bookshelves below Rs. 15000, with Storage type as open & exclude out of stock
	2. From UL Collections, retrieve all sub-menu items under Category and store in a List; Display the same
	3. Gift cards - choose "Birthday/Anniversay"; fill customize the gift card; fill from to details with any one input invalid (example: email); Capture & display the error message
	(Suggested site: urbanladder.com  however you are free to use any other legitimate site)
		 
	----------------------------------------------------------------------------------------	 
	Key Automation Scope :
	----------------------------------------------------------------------------------------
	 
	1. Handling alert, drag & drop, search option
	2. Extract menu items & store in collections
	3. Navigating back to home page
	4. Scrolling down in web page
	5. Filling form (in different objects in web page)
	6. Capture warning message 
	 
	---------------------------------------------------------------------------------------- 
	The Tools and Technology :
	----------------------------------------------------------------------------------------
	TestNG
	Selenium
	cucumber Framework
	Page Object Model [POM]
	Apache poi[MS Excel]
	Extent Report
	 
	----------------------------------------------------------------------------------------
	Project Output Files :
	----------------------------------------------------------------------------------------
	Refer folder reports -> myreport.html
	Refer folder test-output -> SparkReport-> Report-> CucumberExtentReport.html
	For excel output refer folder testData -> Outputdata.xlsx
	 
	---------------------------------------------------------------------------------------- 
	Project Output in console :
	-----------------------------------------------------------------------------------------
	name of the first product : Maple Engineered Wood Bookshelf In Wenge Finish
	name of the second product : Babylon Solid Wood Bookshelf In Walnut Finish
	name of the thried product : Armstrong Engineered Wood Bookshelf In Laminate Finish
	Price of the first product : ₹2,155
	Price of the second product : ₹4,619
	Price of the thried product : ₹8,539
	=================*******************===============================
	
	No matching price in items
	=================*******************===============================
	 
	List sub-menu items :- Beds with Storage
	List sub-menu items :- Accent Chairs
	List sub-menu items :- Bar Cabinets
	List sub-menu items :- Beds without Storage
	List sub-menu items :- Recliners
	List sub-menu items :- Sofa cum Bed
	List sub-menu items :- Bedside Tables
	List sub-menu items :- Crockery Units
	List sub-menu items :- Bookshelves
	List sub-menu items :- Coffee Tables
	List sub-menu items :- Console Table
	List sub-menu items :- Cribs
	List sub-menu items :- Cupboards
	List sub-menu items :- Lounge Chairs
	List sub-menu items :- Balcony Chairs
	List sub-menu items :- Benches
	List sub-menu items :- Chest of Drawers
	List sub-menu items :- Dining Benches
	List sub-menu items :- Dining Chairs
	List sub-menu items :- Loveseats
	List sub-menu items :- Ottomans & Stools
	List sub-menu items :- Single Beds
	List sub-menu items :- Study Chair
	List sub-menu items :- Study Tables
	List sub-menu items :- Wall Shelves
	=================*******************===============================
	
	Please enter valid 10 digit mobile number
	=================*******************===============================
		 
	 
	---------------------------------------------------------------------------------------- 
	Dependencies added for hackathon project :
	----------------------------------------------------------------------------------------
	<dependencies>
	<!--  https://mvnrepository.com/artifact/commons-io/commons-io  -->
	<dependency>
		<groupId>commons-io</groupId>
		<artifactId>commons-io</artifactId>
		<version>2.15.1</version>
	</dependency>
	<!--  https://mvnrepository.com/artifact/org.apache.commons/commons-lang3  -->
	<dependency>
		<groupId>org.apache.commons</groupId>
		<artifactId>commons-lang3</artifactId>
		<version>3.14.0</version>
	</dependency>
	<!--  https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java  -->
	<dependency>
		<groupId>org.seleniumhq.selenium</groupId>
		<artifactId>selenium-java</artifactId>
		<version>4.18.1</version>
	</dependency>
	<!--  https://mvnrepository.com/artifact/org.testng/testng  -->
	<dependency>
		<groupId>org.testng</groupId>
		<artifactId>testng</artifactId>
		<version>7.9.0</version>
	<scope>test</scope>
	</dependency>
	<!--  https://mvnrepository.com/artifact/org.apache.poi/poi  -->
	<dependency>
		<groupId>org.apache.poi</groupId>
		<artifactId>poi</artifactId>
		<version>5.2.5</version>
	</dependency>
	<!--  https://mvnrepository.com/artifact/org.apache.poi/poi-ooxml  -->
	<dependency>
		<groupId>org.apache.poi</groupId>
		<artifactId>poi-ooxml</artifactId>
		<version>5.2.5</version>
	</dependency>
	<!--  https://mvnrepository.com/artifact/com.aventstack/extentreports  -->
	<dependency>
		<groupId>com.aventstack</groupId>
		<artifactId>extentreports</artifactId>
		<version>5.1.1</version>
	</dependency>
	<!--  https://mvnrepository.com/artifact/org.apache.logging.log4j/log4j-api  -->
	<dependency>
		<groupId>org.apache.logging.log4j</groupId>
		<artifactId>log4j-api</artifactId>
		<version>3.0.0-beta2</version>
	</dependency>
	<!--  https://mvnrepository.com/artifact/org.apache.logging.log4j/log4j-core  -->
	<dependency>
		<groupId>org.apache.logging.log4j</groupId>
		<artifactId>log4j-core</artifactId>
		<version>3.0.0-beta2</version>
	</dependency>
	<!--  https://mvnrepository.com/artifact/io.cucumber/cucumber-java  -->
	<dependency>
		<groupId>io.cucumber</groupId>
		<artifactId>cucumber-java</artifactId>
		<version>7.16.1</version>
	</dependency>
	<!--  https://mvnrepository.com/artifact/io.cucumber/cucumber-junit  -->
	<dependency>
		<groupId>io.cucumber</groupId>
		<artifactId>cucumber-junit</artifactId>
		<version>7.16.1</version>
		<scope>test</scope>
	</dependency>
	<dependency>
		<groupId>io.cucumber</groupId>
		<artifactId>cucumber-testng</artifactId>
		<version>7.16.1</version>
		<scope>test</scope>
	</dependency>
	<!--  https://mvnrepository.com/artifact/com.aventstack/extentreports-cucumber4-adapter  -->
	<dependency>
		<groupId>tech.grasshopper</groupId>
		<artifactId>extentreports-cucumber7-adapter</artifactId>
		<version>1.14.0</version>
	</dependency>
	</dependencies>
	