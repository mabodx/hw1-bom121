

/* First created by JCasGen Tue Sep 10 22:48:16 EDT 2013 */
package org.apache.uima;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Tue Sep 10 22:48:16 EDT 2013
 * XML source: /Users/mabodx/git/hw1-bom/hw1-bom/src/main/resources/hw1-bom-typesystem.xml
 * @generated */
public class Score extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Score.class);
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
  protected Score() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public Score(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public Score(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public Score(JCas jcas, int begin, int end) {
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
  //* Feature: casProcessorId

  /** getter for casProcessorId - gets 
   * @generated */
  public String getCasProcessorId() {
    if (Score_Type.featOkTst && ((Score_Type)jcasType).casFeat_casProcessorId == null)
      jcasType.jcas.throwFeatMissing("casProcessorId", "org.apache.uima.Score");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Score_Type)jcasType).casFeatCode_casProcessorId);}
    
  /** setter for casProcessorId - sets  
   * @generated */
  public void setCasProcessorId(String v) {
    if (Score_Type.featOkTst && ((Score_Type)jcasType).casFeat_casProcessorId == null)
      jcasType.jcas.throwFeatMissing("casProcessorId", "org.apache.uima.Score");
    jcasType.ll_cas.ll_setStringValue(addr, ((Score_Type)jcasType).casFeatCode_casProcessorId, v);}    
  }

    