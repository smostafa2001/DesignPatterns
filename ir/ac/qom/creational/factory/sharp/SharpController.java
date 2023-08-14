package ir.ac.qom.creational.factory.sharp;

import ir.ac.qom.creational.factory.matcha.Controller;
import ir.ac.qom.creational.factory.matcha.ViewEngine;

public class SharpController extends Controller {
    @Override
    protected ViewEngine createViewEngine() {return new SharpViewEngine();}
}
