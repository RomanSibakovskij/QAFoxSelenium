# QAFoxSelenium

Simple Selenium test suite on user account registration/login/logout, account information update, user address addition/update/removal, single category product display view, product addition to compare list, basic product addition to cart/checkout, order submission validation, product return. The test suite captures screenshots at the end of test case run (for logging purposes).

#Tech Requirements:

 1.Java JDK 8 or higher 
 
 2.Apache Maven 
 
 3.IntelliJ IDEA (or another IDE that supports Java and Maven)

#Setup

1. Clone this repository into IntelliJ(or other IDE) workspace folder (or wherever the project can be launched by IDE)
2. Open the IDE and open the project folder
3. Navigate to the pom.xml file and install all required dependencies for the test run
4. Run the test suite on the IDE

## Test Case List 

//navigate to 'Register' page test

1.	//Test 001 -> user navigation to 'Register' page test

//valid user account creation test

1.	//Test 002 -> valid user account creation test

//invalid user account creation tests

//no singular input

1.	//Test 002a -> invalid user account creation test - no user first name
2.	//Test 002b -> invalid user account creation test - no user last name
3.	//Test 002c -> invalid user account creation test - no user email address
4.	//Test 002d -> invalid user account creation test - no user phone number
5.	//Test 002e -> invalid user account creation test - no user password
6.	//Test 002f -> invalid user account creation test - no user confirm password
7.	//Test 002g -> invalid user account creation test - don't click 'Agree to Privacy policy' checkbox

//too short singular input

1.	//Test 002h -> invalid user account creation test - too short first name (1 char)
2.	//Test 002i -> invalid user account creation test - too short user last name (1 char)
3.	//Test 002j -> invalid user account creation test - too short user email address (1 char -> name, domain)
4.	//Test 002k -> invalid user account creation test - too short user phone number (2 digits)
5.	//Test 002l -> invalid user account creation test - too short user password (3 chars)

//too long singular input

1.	//Test 002m -> invalid user account creation test - too long first name (33 chars)
2.	//Test 002n -> invalid user account creation test - too long last name (33 chars)
3.	//Test 002o -> invalid user account creation test - too long email address (100 chars -> name, domain)
4.	//Test 002p -> invalid user account creation test - too long phone number (33 digits)
5.	//Test 002q -> invalid user account creation test - too long password (21 chars)

//invalid singular input format

1.	//Test 002r -> invalid user account creation test - invalid first name format (special symbols and digits)
2.	//Test 002s -> invalid user account creation test - invalid last name format (special symbols and digits)
3.	//Test 002t -> invalid user account creation test - invalid email format (missing '@')
4.	//Test 002u -> invalid user account creation test - existing email (used beforehand in manual testing)

//valid user logout test

1.	//Test 003 -> valid user logout test

//valid user login tests

1.	//Test 004 -> valid user login test
2.	//Test 004a -> valid user login test - with updated user email
3.	//Test 004b -> valid user login test - with updated user password

//invalid user login tests

//no singular input

1.	//Test 004c -> invalid user login test - no login email
2.	//Test 004d -> invalid user login test - no login password


//invalid singular input

1.	//Test 004e -> invalid user login test - invalid login email
2.	//Test 004f -> invalid user login test - invalid login password

//valid user account information edit tests

1.	//Test 005 -> valid user first name edit test
2.	//Test 005a -> valid user last name edit test
3.	//Test 005b -> valid user email edit test
4.	//Test 005c -> valid user phone edit test


//invalid user account information edit tests

//no singular input

1.	//Test 005d -> invalid user account information edit test - no first name
2.	//Test 005e -> invalid user account information edit test - no last name
3.	//Test 005f -> invalid user account information edit test - no email
4.	//Test 005g -> invalid user account information edit test - no phone


//too short singular input

1.	//Test 005h -> invalid user account information edit test - too short first name (1 char)
2.	//Test 005i -> invalid user account information edit test - too short last name (1 char)
3.	//Test 005j -> invalid user account information edit test - too short email (1 char -> name,domain)
4.	//Test 005k -> invalid user account information edit test - too short phone (2 digits)

//too long singular input

1.	//Test 005l -> invalid user account information edit test - too long first name (33 chars)
2.	//Test 005m -> invalid user account information edit test - too long last name (33 chars)
3.	//Test 005n -> invalid user account information edit test - too long email (100 chars -> name,domain)
4.	//Test 005o -> invalid user account information edit test - too long phone (33 digits)

//invalid singular input format

1.	//Test 005p -> invalid user account information edit test - invalid first name format (special symbols and digits)
2.	//Test 005q -> invalid user account information edit test - invalid last name format (special symbols and digits)
3.	//Test 005r -> invalid user account information edit test - invalid email format (missing '@')
4.	//Test 005s -> invalid user account information edit test - existing email (used beforehand in manual testing)
5.	//Test 005t -> invalid user account information edit test - invalid phone format (special symbols)

//invalid user password edit tests

//no  input

1.	//Test 006 -> invalid user password edit test - no password / confirm password

//too short input

1.	//Test 006a -> invalid user password edit test - too short password / confirm password

//too long input

1.	//Test 006b -> invalid user password edit test - too long password / confirm password

//mismatched input

1.	//Test 006c -> invalid user password edit test - mismatched confirm password

//valid single address addition test

1.	//Test 007 -> valid user address addition test

//valid multiple addresses addition test

1.	//Test 007a -> valid multiple addresses addition test

//invalid user address addition tests

//no singular input

1.	//Test 007b -> invalid user address addition test - no first name
2.	//Test 007c -> invalid user address addition test - no last name
3.	//Test 007d -> invalid user address addition test - no address (address 1)
4.	//Test 007e -> invalid user address addition test - no city
5.	//Test 007f -> invalid user address addition test - no country
6.	//Test 007g -> invalid user address addition test - no state


//too short singular input

1.	//Test 007h -> invalid user address addition test - too short first name  (1 char)
2.	//Test 007i -> invalid user address addition test - too short last name  (1 char)
3.	//Test 007j -> invalid user address addition test - too short address  (2 chars)
4.	//Test 007k -> invalid user address addition test - too short city  (1 char)

//too long singular input

1.	//Test 007l -> invalid user address addition test - too long first name  (33 chars)
2.	//Test 007m -> invalid user address addition test - too long last name (33 chars)
3.	//Test 007n -> invalid user address addition test - too long address (129 chars)
4.	//Test 007o -> invalid user address addition test - too long city (129 chars)

//invalid singular input format

1.	//Test 007p -> invalid user address addition test - invalid first name format (special symbols and digits)
2.	//Test 007q -> invalid user address addition test - invalid last name format (special symbols and digits)
3.	//Test 007r -> invalid user address addition test - invalid user address (address1) format (special symbols only)
4.	//Test 007s -> invalid user address addition test - invalid user city format (special symbols only)

//user address edit test

1.	//Test 007t -> user address edit test

//user address delete tests

1.	//Test 007u -> user address delete (default) test
2.	//Test 007v -> user address delete test (one of addresses)

//valid product addition to wishlist tests - the result is similar for all categories (only registered users have this feature)

1.	//Test 008 -> valid featured product (MacBook) addition to wishlist test
2.	//Test 008a -> single available product (HP LP3065) addition to cart from wishlist test
3.	//Test 008b -> valid multiple featured products (MacBook, Iphone, Apple Cinema 30'') addition to wishlist test

//remove product from wishlist test - the result is similar for all categories / product quantities (only registered users have this feature)

1.	//Test 008c -> valid featured product (MacBook) removal to wishlist test


//user navigation to single category page tests

1.	//Test 009 -> navigate to 'Desktops' category page test (as a guest)
2.	//Test 009a -> navigate to 'Desktops' category page test (as a registered user)

//add products to compare tests as a guest

1.	//Test 010 -> add set products (HP LP3065, Iphone, Canon EOS 5ED) to product compare page test (as a guest)
2.	//Test 010a -> add set product (HP LP3065) to cart from product compare page test (as a guest)
3.	//Test 010b -> remove set products (HP LP3065, Iphone, Canon EOS 5ED) from product compare page test (as a guest)


//add products to compare test as a registered user

1.	//Test 010c -> add set products (HP LP3065, Iphone, Canon EOS 5ED) to product compare page test (as a registered user)
2.	//Test 010d -> add set product (HP LP3065) to cart from product compare page test (as a registered user)


//single (specific category) product addition to cart tests

1.	//Test 011 -> single product (HP LP3065) addition to cart page test (as a guest)
2.	//Test 011a -> single product (HP LP3065) addition to cart page test (as a registered user)


//single (specific category) product removal from shopping cart dropdown menu test

1.	//Test 011b -> single product (HP LP3065) removal from shopping cart dropdown menu test


//single (specific category) product addition to cart tests

1.	//Test 011c -> single searched product (Ipod Touch) addition to cart page test (as a guest)
2.	//Test 011d -> single searched product (Ipod Touch) addition to cart page test (as a registered user)

//single product page invalid review submission tests (only guest branch is tested since both guest and registered user will have the same output) (they don't impact the addition to cart process, the review simple fails to be added)

//no singular input

1.	//Test 012 -> single product (HP LP3065) addition to cart page without review username test
2.	//Test 012a -> single product (HP LP3065) addition to cart page without review text test
3.	//Test 012b -> single product (HP LP3065) addition to cart page without review rating test

//too short singular input

1.	//Test 012c -> single product (HP LP3065) addition to cart page with too short review username test (2 chars)
2.	//Test 012d -> single product (HP LP3065) addition to cart page with too short review text test (24 chars)

//too long singular input

1.	//Test 012e -> single product (HP LP3065) addition to cart page with too long review username test (26 chars)
2.	//Test 012f -> single product (HP LP3065) addition to cart page with too long review text test (1001 chars)


//single product page invalid delivery date submission tests (only guest branch is tested since both guest and registered user will have the same output)

1.	//Test 013 -> single product (HP LP3065) addition to cart page without delivery date test
2.	//Test 013a -> single product (HP LP3065) addition to cart page with reversed delivery date test
3.	//Test 013b -> single product (HP LP3065) addition to cart page with past delivery date test

//single product addition to check out tests

1.	//Test 014 -> single product (HP LP3065) addition to check out page test (as a guest)
2.	//Test 014a -> single product (HP LP3065) addition to check out page test (as a registered user)

//multiple product addition to check out tests

1.	//Test 014b -> multiple products (HP LP3065) addition to check out page test (as a guest)
2.	//Test 014c -> multiple products (HP LP3065) addition to check out page test (as a registered user)


//update product quantity during addition to check out test (guest and registered user will have the same output, guest branch only is tested)

1.	//Test 014d -> product quantity update during (HP LP3065) addition to check out page test


//product remove from shopping cart test (guest and registered user will have the same output, guest branch only is tested)

1.	//Test 014e -> product remove (HP LP3065) from shopping cart test


//update product quantity during addition to check out test (guest and registered user will have the same output, guest branch only is tested)

1.	//Test 014f -> single product (HP LP3065) addition to check out (without shipping country and state) page test


//valid check out confirmation tests

1.	//Test 015 -> single product (HP LP3065) check out confirmation test (as a guest)
2.	//Test 015a -> single product (HP LP3065) check out confirmation test (as a registered user)

//multiple products tests

1.	//Test 015b -> multiple products (HP LP3065) check out confirmation test (as a guest)
2.	//Test 015c ->  multiple products (HP LP3065) check out confirmation test (as a registered user)

//invalid check out confirmation tests (as a guest) -> only guest branch is being tested since few negative scenarios registered user has, are similar to the guest


//no singular input

1.	//Test 015d -> invalid single product (HP LP3065) check out confirmation test (as a guest) - no guest first name
2.	//Test 015e -> invalid single product (HP LP3065) check out confirmation test (as a guest) - no guest last name
3.	//Test 015f -> invalid single product (HP LP3065) check out confirmation test (as a guest) - no guest email
4.	//Test 015g -> invalid single product (HP LP3065) check out confirmation test (as a guest) - no guest phone
5.	//Test 015h -> invalid single product (HP LP3065) check out confirmation test (as a guest) - no guest address
6.	//Test 015j -> invalid single product (HP LP3065) check out confirmation test (as a guest) - no guest post code
7.	//Test 015k -> invalid single product (HP LP3065) check out confirmation test (as a guest) - no guest country
8.	//Test 015l -> invalid single product (HP LP3065) check out confirmation test (as a guest) - no guest state
9.	//Test 015m -> invalid single product (HP LP3065) check out confirmation test (as a guest) - no guest 'Agree to Terms' checkbox selection


//too short singular input

1.	//Test 015n -> invalid single product (HP LP3065) check out confirmation test (as a guest) - too short guest first name (1 char)
2.	//Test 015o -> invalid single product (HP LP3065) check out confirmation test (as a guest) - too short guest last name (1 char)
3.	//Test 015p -> invalid single product (HP LP3065) check out confirmation test (as a guest) - too short guest email (1 char -> name, domain)
4.	//Test 015q -> invalid single product (HP LP3065) check out confirmation test (as a guest) - too short guest phone (2 digits)
5.	//Test 015r -> invalid single product (HP LP3065) check out confirmation test (as a guest) - too short guest address (2 chars)
6.	//Test 015s -> invalid single product (HP LP3065) check out confirmation test (as a guest) - too short guest city (1 char)
7.	//Test 015t -> invalid single product (HP LP3065) check out confirmation test (as a guest) - too short guest post code (1 char)


//too long singular input

1.	//Test 015u -> invalid single product (HP LP3065) check out confirmation test (as a guest) - too long guest first name (33 chars)
2.	//Test 015v -> invalid single product (HP LP3065) check out confirmation test (as a guest) - too long guest last name (33 chars)
3.	//Test 015w -> invalid single product (HP LP3065) check out confirmation test (as a guest) - too long guest email (100 chars -> name, domain)
4.	//Test 015x -> invalid single product (HP LP3065) check out confirmation test (as a guest) - too long guest phone (33 digits)
5.	//Test 015y -> invalid single product (HP LP3065) check out confirmation test (as a guest) - too long guest address (129 chars)
6.	//Test 015z -> invalid single product (HP LP3065) check out confirmation test (as a guest) - too long guest city (129 chars)
7.	//Test 015aa -> invalid single product (HP LP3065) check out confirmation test (as a guest) - too long guest post code (11 digits)


//invalid singular input format


1.	//Test 015ab -> invalid single product (HP LP3065) check out confirmation test (as a guest) - invalid guest first name (special symbols only)
2.	//Test 015ac -> invalid single product (HP LP3065) check out confirmation test (as a guest) - invalid guest last name (special symbols and digits only)
3.	//Test 015ad -> invalid single product (HP LP3065) check out confirmation test (as a guest) - invalid guest email format (special symbols and digits only)
4.	//Test 015ae -> invalid single product (HP LP3065) check out confirmation test (as a guest) - pre-existing user email (used in other account)
5.	//Test 015af -> invalid single product (HP LP3065) check out confirmation test (as a guest) - invalid guest phone format (special symbols only)
6.	//Test 015ag -> invalid single product (HP LP3065) check out confirmation test (as a guest) - invalid guest address format (special symbols only)
7.	//Test 015ah -> invalid single product (HP LP3065) check out confirmation test (as a guest) - invalid guest city format (special symbols only)
8.	//Test 015ai -> invalid single product (HP LP3065) check out confirmation test (as a guest) - invalid guest post code format (special symbols only)


//valid check out confirmation with valid checkout login test

1.	//Test 016 -> single product (HP LP3065) check out confirmation with valid checkout login test (as a registered user)

//invalid check out confirmation with invalid checkout login tests


//no singular input

1.	//Test 016a -> single product (HP LP3065) check out confirmation with invalid checkout login test - no email (as a registered user)
2.	//Test 016b -> single product (HP LP3065) check out confirmation with invalid checkout login test - no password (as a registered user)


//invalid singular input

1.	//Test 016c -> single product (HP LP3065) check out confirmation with invalid checkout login test - invalid email (as a registered user)
2.	//Test 016d -> single product (HP LP3065) check out confirmation with invalid checkout login test - invalid password (as a registered user)

//checked out order history tests

1.	//Test 017 -> single product (HP LP3065) order history confirmation test (as a guest)
2.	//Test 017a -> single product (HP LP3065) order history confirmation test (as a registered user)


//product return test

1.	//Test 018 -> single product return (HP LP3065) test (as a registered user) ('Order Error')
