	public static double RangePickup( double startx , double endx , double starty , double endy , Driver d , Passenger p ){
		    
		    double globalx = endx - startx;
		    double globaly = endy - starty;
		    double localx = p.x - d.x;
		    double localy = p.y - d.y;
		    double currentx = endx - d.x;
		    double currenty = endy - d.y;
		    double value;
		    if( globalx * localx <= 0 ) {
		    	valuex = math.abs(localx);
		    }
		    else
			valuex = 0;
		    if( globaly * localy <= 0 ){
			    valuey = math.abs(localy);
		    }
		    else
	               valuey = 0;
		   double backtrack = valuex + valuey;
		    if( globaly == 0 ) {
		    	valuey == 1;
		    }
		    double range = 1.25 * (1 - manhatten( currentx , currenty ) / manhatten( globalx , globaly ));
		    return backtrack;
		    }
		    }
		    
	}
