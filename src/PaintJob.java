public class PaintJob {
    public static void main(String[] args) {
        int bucket = getBucketCount(3.4, 2.1, 1.5, 2);
        int bucket1 = getBucketCount(3.4, 2.1, 1.5);
        int bucket3 = getBucketCount(3.4, 1.5);
        System.out.println(bucket);
        System.out.println(bucket1);
        System.out.println(bucket3);
    }

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBucket) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBucket < 0) {
            return -1;
        }
        double areaOfWall = width * height;
        int bucketNeeded = (int) Math.ceil(areaOfWall / areaPerBucket);
        return bucketNeeded - extraBucket;
    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {
        return getBucketCount(width, height, areaPerBucket, 0);
    }

    public static int getBucketCount(double area, double areaPerBucket) {
        return getBucketCount(area, 1, areaPerBucket, 0);
    }
}
