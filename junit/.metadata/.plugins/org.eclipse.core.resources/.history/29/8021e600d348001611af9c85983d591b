<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html lang="en">
<%@include file="Header.jsp" %>
<body background="<c:url value="/resources/images/Lospennato1.jpg" />" >


<div class="container">
	<div class="row">
		<div class="col-sm-4">
			<div id="myCarousel" class="carousel slide" data-ride="carousel">
				<!-- Indicators -->
				<ol class="carousel-indicators">
					<li data-target="#myCarousel" data-slide-to="0" class="active"></li>
					<li data-target="#myCarousel" data-slide-to="1"></li>
				</ol>

			<!-- Wrapper for slides -->
			<div class="carousel-inner" role="listbox">
				<div class="item active">
					<img src="<c:url value="/resources/images/chromo.jpg"/>"  alt="Image" width="152" height="118">
					<div class="carousel-caption">
						<h3>Buy for 785</h3>
						<p>String Guitar</p>
					</div>      
				</div>
		
				<div class="item">
					<img src="<c:url value="/resources/images/images3.jpg"/>"  alt="Image" width="152" height="118">
					<div class="carousel-caption">
						<h3>Buy for Rs.999</h3>
						<p>Violin</p>
					</div>      
				</div>
		
				<div class="item">
					<img src="<c:url value="/resources/images/Sign.jpg"/>"  alt="Image" width="152" height="118">
					<div class="carousel-caption">
						<h3>Buy for 5599</h3>
						<p>Signature acoustical Guitar</p>
					</div>      
				</div>
			</div>

			<!-- Left and right controls -->
			<a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
				<span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
				<span class="sr-only">Previous</span>
			</a>
			<a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
				<span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
				<span class="sr-only">Next</span>
			</a>
		</div>
	</div>

	<div class="col-sm-3">
			<button type ="button" class="btn-btn-info  btn-md">Hot Deals </button>
			<hr>
			<button type ="button" class="btn-btn-info  btn-md">Easy EMI options - Buy now Pay later </button>
			<hr>
			<button type ="button" class="btn-btn-info  btn-md">Attractive Exchange Offers</button>
			<hr>
			<button type ="button" class="btn-btn-info  btn-md">New Arrivals </button>
	</div>

	<div class="col-sm-4">
		<div id="myCarousel" class="carousel slide" data-ride="carousel">
			<!-- Indicators -->
			<ol class="carousel-indicators">
				<li data-target="#myCarousel" data-slide-to="0" class="active"></li>
				<li data-target="#myCarousel" data-slide-to="1"></li>
			</ol>

			<!-- Wrapper for slides -->
			<div class="carousel-inner" role="listbox">
				<div class="item active">
					<img src="<c:url value="/resources/images/th.jpg"/>" alt="Image" width="152" height="118">
					<div class="carousel-caption">
						<h3 class="bg-danger">Buy for 19,589</h3>
						<p class="bg-danger">Stagg TIM</p>
					</div>      
				</div>
		
				<div class="item">
					<img src="<c:url value="/resources/images/a.jpg"/>" alt="Image" width="152" height="118">
					<div class="carousel-caption">
						<h3>Buy for Rs.489</h3>
						<p>Flute</p>
					</div>      
				</div>
			</div>

			<!-- Left and right controls -->
			<a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
				<span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
				<span class="sr-only">Previous</span>
			</a>
			<a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
				<span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
				<span class="sr-only">Next</span>
			</a>
		</div>
	</div>
	</div>
		
	</div>
		</div>
	</div>
		<hr>
	</div><br>
	<ul id="menu">
		<c:forEach items="${categoryList}" var="category">
			<li><a href=${category.name}>${category.name}</a>
				<ul>
					<c:forEach items="${category.product}" var="product">

						<li><a href="<c:url value='product/get/${product.id}' />">${product.name}</a></li>

					</c:forEach>

				</ul></li>
		</c:forEach>

	</ul>
	<hr color="red" size="5">
	<br><br><br>
	<div>
		<c:if test="${!empty selectedProduct.name}">
			<table>
				<tr>
					<th align="left" width="80">Product ID</th>
					<th align="left" width="120">Product Name</th>
					<th align="left" width="200">Product Description</th>
					<th align="left" width="80">Price</th>
					<th align="left" width="200">Product Category</th>
					<th align="left" width="200">Product Supplier</th>
					
				</tr>
				<tr>
					<td align="left" >${selectedProduct.id}</td>
					<td align="left" >${selectedProduct.name}</td>
					<td align="left" >${selectedProduct.description}</td>
					<td align="left" >${selectedProduct.price}</td>
					<td align="left" >${selectedProduct.category.name}</td>
					<td align="left" >${selectedProduct.supplier.name}</td>
				</tr>
			</table>
		</c:if>
	</div><br>


	
		
		
		
		
		
		
		
	


<div class="container">    
  <div class="row">
    <div class="col-sm-4">
      <div class="panel panel-primary">
        <div class="panel-heading">MUSIC GIVES SOUL TO THE UNIVERSE</div>
        <img src="<c:url value="/resources/images/pnr.jpg"/>"  alt="Image" width="360" height="200">
        
      </div>
    </div>
    <div class="col-sm-4"> 
      <div class="panel panel-danger">
        <div class="panel-heading">LEARN TO PLAY MUSIC NOW</div>
        <img src="<c:url value="/resources/images/rrr.jpg"/>"  alt="Image" width="360" height="200">
        
      </div>
    </div>
    <div class="col-sm-4"> 
      <div class="panel panel-success">
        <div class="panel-heading">WITHOUT MUSIC LIFE WOULD BE MISTAKE</div>
              <img src="<c:url value="/resources/images/eee.jpg"/>"  alt="Image" width="360" height="200">
        
      </div>
    </div>
  </div>
</div><br>
   
  
    <div class="col-sm-4">
      <div class="panel panel-primary">
        
              <img src="<c:url value="/resources/images/feature1.jpg"/>"  alt="Image" width="400" height="250">
        
      </div>
    </div>
    
    
    
    <div class="col-sm-4"> 

    <div class="panel panel-primary">
            
             <img src="<c:url value="/resources/images/feature2.jpg"/>"  alt="Image" width="400" height="250">
     
      </div>
    </div>
    <div class="col-sm-4"> 
      <div class="panel panel-primary">
        
        <img src="<c:url value="/resources/images/feature3.jpg"/>"  alt="Image" width="400" height="250">
        
      </div>
    </div>
  
  <div class="col-sm-4"> 
      <div class="panel panel-primary">
        
        <img src="<c:url value="/resources/images/feature4.jpg"/>"  alt="Image" width="400" height="250">
        
      </div>
    </div>
  
  <div class="col-sm-4"> 
      <div class="panel panel-primary">
        
        <img src="<c:url value="/resources/images/feature5.jpg"/>"  alt="Image" width="400" height="250">
        
      </div>
    </div>
  
   <div class="col-sm-4"> 
      <div class="panel panel-primary">
        
        <img src="<c:url value="/resources/images/feature6.jpg"/>"  alt="Image" width="400" height="250">
        
      </div>
    </div>
  <div class="col-sm-4"> 
      <div class="panel panel-primary">
        
       <img src="<c:url value="/resources/images/feature7.jpg"/>"  alt="Image" width="400" height="250">
        
      </div>
    </div>
    <div class="col-sm-4"> 
      <div class="panel panel-primary">
        
        <img src="<c:url value="/resources/images/feature8.jpg"/>"  alt="Image" width="400" height="250">
        
      </div>
    </div>
    <div class="col-sm-4"> 
      <div class="panel panel-primary">
        
        <img src="<c:url value="/resources/images/feature9.jpg"/>"  alt="Image" width="400" height="250">
        
      </div>
    </div>
    <div class="col-sm-4"> 
      <div class="panel panel-primary">
        
       <img src="<c:url value="/resources/images/feature10.jpg"/>"  alt="Image" width="400" height="250">
        
      </div>
    </div>
     <div class="col-sm-4"> 
      <div class="panel panel-primary">
        
      <img src="<c:url value="/resources/images/feature11.jpg"/>"  alt="Image" width="400" height="250">
        
      </div>
    </div>
    <div class="col-sm-4"> 
      <div class="panel panel-primary">
        
        <img src="<c:url value="/resources/images/feature12.jpg"/>"  alt="Image" width="400" height="250">
        
      </div>
    </div>
    <div class="col-sm-4"> 
      <div class="panel panel-primary">
        
   <img src="<c:url value="/resources/images/feature13.jpg"/>"  alt="Image" width="400" height="250">
        
      </div>
    </div>
    <div class="col-sm-4"> 
      <div class="panel panel-primary">
        
       <img src="<c:url value="/resources/images/feature14.jpg"/>"  alt="Image" width="400" height="250">
        
      </div>
    </div>
     <div class="col-sm-4"> 
      <div class="panel panel-primary">
        
        <img src="<c:url value="/resources/images/feature15.jpg"/>"  alt="Image" width="400" height="250">
        
      </div>
    </div>
  
  

<div class="container ">    
	<ul class="text-left"> <h3>Latest models</h3>
	<ul class="text-right">	<h3> Feedbacks </h3>

	<br>
	<div class="row">
		<div class="col-sm-3">
			<img src="<c:url value="/resources/images/retail.png"/>" class="img-responsive" style="width:100%" alt="Image">
		</div>
		<div class="col-sm-3"> 
			<img src="<c:url value="/resources/images/HT.jpg"/>" class="img-responsive" style="width:100%" alt="Image">
		</div>
		<div class="col-sm-3">
			<div class="well">
				<p><h6>I brought keyboard in the THIVYA MUSICALS where is working well for past 2years.I am very satisfied - Ram	</h6> </p>
			</div>
			<div class="well">
				<p> <h6>I ordered the Piano on monday . The next day itself I received the 
				piano. Unbelievable service - Naveen</h6> </p>
			</div>
		</div>
		<div class="col-sm-3">
			<div class="well">
				<p> <h6>The packaging of the instruments was very good. I recommend this site for my friends-Vijay</h6> </p>
			</div>
			<div class="well">
				<p><h6>No websites can sell as cheap as THIVYA MUSICALS. The most trusted website by the customers-Sri</h6> </p>
			</div>
		</div>  
	</div>
	<hr>
</div>
<footer class="container-fluid text-center">
					<p class="bg-danger"><h3>Number 1 Website for Selling instruments for the past 10 years</h3> </p>
					<p class="bg-danger" > <h2>Got the award for best seller from MUSICAL Associations of India</h2></p>
					
</footer>

</body>
</html>