	public static double RangePickup( double startx , double endx , double starty , double endy , Driver d , Passenger p ){
		    
		    double globalx = endx - startx;
		    double globaly = endy - starty;
		    double localx = p.x - d.x;
		    double localy = p.y - d.y;
		    double currentx = endx - d.x;
		    double currenty = endy - d.y;
		    double valuex , valuey;
		    if( globalx * localx <= 0 ) {
		    	valuex = math.abs( localx );
		    }
		    else
			valuex = 0;
		    if( globaly * localy <= 0 ){
			    valuey = math.abs( localy );
		    }
		    else
	               valuey = 0;
		    double backtrack = valuex + valuey;
		    double r1 = ( 1 + 0.25 );
		    double r2 = 1 + (0.25 * manhattan( currentx , currenty ) < manhattan( globalx , globaly ) ? (1 - manhattan( currentx , currenty ) / manhattan( globalx , globaly )) : 0);
		    return math.pow( backtrack , (r1 * r2) );
		    }
		    }
		    
	}
