

/* First created by JCasGen Tue Sep 10 22:48:16 EDT 2013 */
package org.apache.uima;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.FSArray;
import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Tue Sep 10 22:48:16 EDT 2013
 * XML source: /Users/mabodx/git/hw1-bom/hw1-bom/src/main/resources/hw1-bom-typesystem.xml
 * @generated */
public class NGram extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(NGram.class);
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int type = typeIndexID;
  /** @generated  */
  @Override
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected NGram() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public NGram(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public NGram(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public NGram(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** <!-- begin-user-doc -->
    * Write your own initialization here
    * <!-- end-user-doc -->
  @generated modifiable */
  private void readObject() {/*default - does nothing empty block */}
     
 
    
  //*--------------*
  //* Feature: casProcessId

  /** getter for casProcessId - gets 
   * @generated */
  public String getCasProcessId() {
    if (NGram_Type.featOkTst && ((NGram_Type)jcasType).casFeat_casProcessId == null)
      jcasType.jcas.throwFeatMissing("casProcessId", "org.apache.uima.NGram");
    return jcasType.ll_cas.ll_getStringValue(addr, ((NGram_Type)jcasType).casFeatCode_casProcessId);}
    
  /** setter for casProcessId - sets  
   * @generated */
  public void setCasProcessId(String v) {
    if (NGram_Type.featOkTst && ((NGram_Type)jcasType).casFeat_casProcessId == null)
      jcasType.jcas.throwFeatMissing("casProcessId", "org.apache.uima.NGram");
    jcasType.ll_cas.ll_setStringValue(addr, ((NGram_Type)jcasType).casFeatCode_casProcessId, v);}    
   
    
  //*--------------*
  //* Feature: element

  /** getter for element - gets 
   * @generated */
  public FSArray getElement() {
    if (NGram_Type.featOkTst && ((NGram_Type)jcasType).casFeat_element == null)
      jcasType.jcas.throwFeatMissing("element", "org.apache.uima.NGram");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((NGram_Type)jcasType).casFeatCode_element)));}
    
  /** setter for element - sets  
   * @generated */
  public void setElement(FSArray v) {
    if (NGram_Type.featOkTst && ((NGram_Type)jcasType).casFeat_element == null)
      jcasType.jcas.throwFeatMissing("element", "org.apache.uima.NGram");
    jcasType.ll_cas.ll_setRefValue(addr, ((NGram_Type)jcasType).casFeatCode_element, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for element - gets an indexed value - 
   * @generated */
  public Token getElement(int i) {
    if (NGram_Type.featOkTst && ((NGram_Type)jcasType).casFeat_element == null)
      jcasType.jcas.throwFeatMissing("element", "org.apache.uima.NGram");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((NGram_Type)jcasType).casFeatCode_element), i);
    return (Token)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((NGram_Type)jcasType).casFeatCode_element), i)));}

  /** indexed setter for element - sets an indexed value - 
   * @generated */
  public void setElement(int i, Token v) { 
    if (NGram_Type.featOkTst && ((NGram_Type)jcasType).casFeat_element == null)
      jcasType.jcas.throwFeatMissing("element", "org.apache.uima.NGram");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((NGram_Type)jcasType).casFeatCode_element), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((NGram_Type)jcasType).casFeatCode_element), i, jcasType.ll_cas.ll_getFSRef(v));}
  }

    