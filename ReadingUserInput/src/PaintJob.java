public class PaintJob {
    public static void main(String[] args) {
//        System.out.println(getBucketCount(2.75,3.25,2.5,1));
        System.out.println(getBucketCount(3.4,1.5));
        
    }
    public static int getBucketCount (double width, double height, double areaPerBucket, int extraBuckets) {
        if(width <= 0 || height <= 0 || areaPerBucket <= 0) {
            return -1;
        } else {
            double area = width * height;
            return (int) Math.ceil(area/areaPerBucket) - extraBuckets;
        }
    }

    public static int getBucketCount (double width, double height, double areaPerBucket) {
        return getBucketCount(width,height,areaPerBucket,0);
    }

    public static int getBucketCount (double area, double areaPerBucket) {
        return getBucketCount(1,area,areaPerBucket,0);
    }



}
