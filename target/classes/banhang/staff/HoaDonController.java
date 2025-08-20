/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package banhang.staff;

import banhang.entity.HoaDon;
import banhang.manager.CrudController;

/**
 *
 * @author ADMIN
 */
public interface HoaDonController extends CrudController<HoaDon>{
    void search();
    void refresh();
    int generateNewSOHD();
}
