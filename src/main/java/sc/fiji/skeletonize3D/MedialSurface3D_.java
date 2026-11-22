package sc.fiji.skeletonize3D;

import ij.ImagePlus;

public class MedialSurface3D_ extends Skeletonize3D_{
	public int setup(String arg, ImagePlus imp) 
	{
		this.surfaceMode = true;
		return super.setup(arg,imp);
	} 
}
