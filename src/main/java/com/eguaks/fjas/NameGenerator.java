package com.eguaks.fjas;

import java.util.List;

/**
 * Created by Modulus on 23/02/16.
 */
public interface NameGenerator {
    String generate();
    List<String> generate(int amount);
}
