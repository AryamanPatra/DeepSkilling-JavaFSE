class Search {

    public static int linearSearch(Product[] products, String productName) {
        for (int i = 0; i < products.length; i++) {
            if (products[i].getProductName().equals(productName)) {
                return i; // Return the index of the found product
            }
        }
        return -1; // Return -1 if the product is not found
    }

    public static int binarySearch(Product[] products, String productName) {
        int left = 0;
        int right = products.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int result = products[mid].getProductName().compareTo(productName);

            if (result == 0) {
                return mid; // Return the index of the found product
            } else if (result < 0) {
                left = mid + 1; // Search the right half
            } else {
                right = mid - 1; // Search the left half
            }
        }
        return -1; // Return -1 if the product is not found
    }
}
