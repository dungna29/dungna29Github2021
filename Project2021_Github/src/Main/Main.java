/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Services.ServiceKeToan;

/**
 *
 * @author Dungna29
 */
public class Main {
    /*
    Đối với màn chung của dự án, khi mình cần can thiệp vào main
    1. Báo tất cả các thành viên ai đang làm trên màn này, yêu cầu người ta hoàn tất
    và commit code của màn chung là main lên.
    2. Sau thành viên sử dụng commit lên thì mình sẽ tiến hành Pull Code về.
    3. Sau khi mình làm xong thì commit code lên và thông báo lại cho team dự án.
    */
    public static void main(String[] args) {
        ServiceKeToan keToan = new ServiceKeToan();
        keToan.themKeToan();
    }
}
