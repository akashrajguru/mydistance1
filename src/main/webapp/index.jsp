<html>
<head>
<script type="text/javascript" src="asset/js/jquery-2.1.1.min.js"></script>
<script type="text/javascript" src="asset/js/custom.js"></script>
</head>
<body>
<h2>MyDistance Utility</h2> 
<form> 
<table> 
	<tr> 
	<td><input type="text" placeholder="My Distance" id="mydistance" name="distance"></td>
	<td><input type="radio" name="distin" id="distin" value="km">KM<br>
		<input type="radio" name="distin" id="distin" value="m">Meter
	</td>
	</tr>
	<tr></tr>
	<tr></tr>
	<tr></tr>
	<tr>
		<td><label for="convert">Convert To</label></td>
		<td><input type="radio" name="convertto" id="convertto" value="yd">Yard<br>
			<input type="radio" name="convertto" id="convertto" value="mi">Miles
		</td>
	</tr> 
	<tr>
		<td><input type="button" id="submit" value="convert"></td>
	</tr>
</table>
<div id="convertvalue"></div>
</form>
</body>
</html>