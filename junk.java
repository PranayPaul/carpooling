	public static double RangePickup( double startx , double endx , double starty , double endy , Driver d , Passenger p   ){
		    
		    double globalx = endx - startx;
		    double globaly = endy - starty;
		    double localx = p.x - d.x;
		    double localy = p.y - d.y;
		    if( globalx == 0 ) {
		    	globalx == 1;
		    }
		    if( globaly == 0 ) {
		    	globaly == 1;
		    }
		    double divx = localx / globalx;
		    double divy = localy / globaly;
		    if( divx > 0 ) {
		    	divx = 0;
		    if( divy > 0 )
		    	divy = 0;
		    double track = -( divx + divy );
		    return track;
		    }
		    }
		    
	}
