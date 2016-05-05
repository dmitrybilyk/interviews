package com.learn.effectivejava.refactoring.refactoring_guru.razduvalschiki.bolshoy_class;

/**
 * Created by Dimon on 05.05.2016.
 */
//Причины рефакторинга
//        Вы хотите иметь несколько видов интерфейса для одних и тех же данных (например, у вас есть приложение не
// только для десктопа, но также для телефонов и планшетов). В этом случае вам будет очень сложно избежать большого
// количества ошибок и дублирования кода, если вы не разделите GUI и предметную область.
public class dublirovaniye_vidimyh_dannyh {

//    class IntervalWindow extends Frame {
//        java.awt.TextField startField;
//        java.awt.TextField endField;
//        java.awt.TextField lengthField;
//
//        public IntervalWindow() {
//            startField = new java.awt.TextField();
//            endField = new java.awt.TextField();
//            lengthField = new java.awt.TextField();
//            SymFocus focusListener = new SymFocus();
//            startField.addFocusListener(focusListener);
//            endField.addFocusListener(focusListener);
//            lengthField.addFocusListener(focusListener);
//        }
//
//        class SymFocus extends java.awt.event.FocusAdapter {
//            public void focusLost(java.awt.event.FocusEvent event) {
//                Object object = event.getSource();
//                if (object == startField) {
//                    StartField_FocusLost(event);
//                }
//                else if (object == endField) {
//                    EndField_FocusLost(event);
//                }
//                else if (object == lengthField) {
//                    LengthField_FocusLost(event);
//                }
//            }
//
//            void StartField_FocusLost(java.awt.event.FocusEvent event) {
//                if (isNotInteger(startField.getText())) {
//                    startField.setText("0");
//                }
//                calculateLength();
//            }
//
//            void EndField_FocusLost(java.awt.event.FocusEvent event) {
//                if (isNotInteger(endField.getText())) {
//                    endField.setText("0");
//                }
//                calculateLength();
//            }
//
//            void LengthField_FocusLost(java.awt.event.FocusEvent event) {
//                if (isNotInteger(lengthField.getText())) {
//                    lengthField.setText("0");
//                }
//                calculateEnd();
//            }
//
//            void calculateLength() {
//                try {
//                    int start = Integer.parseInt(startField.getText());
//                    int end = Integer.parseInt(endField.getText());
//                    int length = end - start;
//                    lengthField.setText(String.valueOf(length));
//                } catch (NumberFormatException e) {
//                    throw new RuntimeException ("Unexpected Number Format Error");
//                }
//            }
//            void calculateEnd() {
//                try {
//                    int start = Integer.parseInt(startField.getText());
//                    int length = Integer.parseInt(lengthField.getText());
//                    int end = start + length;
//                    endField.setText(String.valueOf(end));
//                } catch (NumberFormatException e) {
//                    throw new RuntimeException ("Unexpected Number Format Error");
//                }
//            }
//        }
//    }
//
//    TO
//
//    class IntervalWindow extends Frame implements Observer {
//        java.awt.TextField startField;
//        java.awt.TextField endField;
//        java.awt.TextField lengthField;
//        private Interval subject;
//
//        public IntervalWindow() {
//            startField = new java.awt.TextField();
//            endField = new java.awt.TextField();
//            lengthField = new java.awt.TextField();
//            SymFocus focusListener = new SymFocus();
//            startField.addFocusListener(focusListener);
//            endField.addFocusListener(focusListener);
//            lengthField.addFocusListener(focusListener);
//
//            subject = new Interval();
//            subject.addObserver(this);
//            update(subject, null);
//        }
//
//        class SymFocus extends java.awt.event.FocusAdapter {
//            public void focusLost(java.awt.event.FocusEvent event) {
//                Object object = event.getSource();
//                if (object == startField) {
//                    StartField_FocusLost(event);
//                }
//                else if (object == endField) {
//                    EndField_FocusLost(event);
//                }
//                else if (object == lengthField) {
//                    LengthField_FocusLost(event);
//                }
//            }
//
//            void StartField_FocusLost(java.awt.event.FocusEvent event) {
//                setStart(startField.getText());
//                if (isNotInteger(getStart())) {
//                    setStart("0");
//                }
//                subject.calculateLength();
//            }
//
//            void EndField_FocusLost(java.awt.event.FocusEvent event) {
//                setEnd(endField.getText());
//                if (isNotInteger(getEnd())) {
//                    setEnd("0");
//                }
//                subject.calculateLength();
//            }
//
//            void LengthField_FocusLost(java.awt.event.FocusEvent event) {
//                setLength(lengthField.getText());
//                if (isNotInteger(getLength())) {
//                    setLength("0");
//                }
//                subject.calculateEnd();
//            }
//        }
//
//        public void update(Observable observed, Object arg) {
//            endField.setText(subject.getEnd());
//            startField.setText(subject.getStart());
//            lengthField.setText(subject.getLength());
//        }
//
//        String getEnd() {
//            return subject.getEnd(arg);
//        }
//        void setEnd(String arg) {
//            subject.setEnd(arg);
//        }
//        String getStart() {
//            return subject.getStart(arg);
//        }
//        void setStart(String arg) {
//            subject.setStart(arg);
//        }
//        String getLength() {
//            return subject.getLength(arg);
//        }
//        void setLength(String arg) {
//            subject.setLength(arg);
//        }
//    }
//
//    class Interval extends Observable {
//        private String end = "0";
//        private String start = "0";
//        private String length = "0";
//
//        String getEnd() {
//            return end;
//        }
//        void setEnd(String arg) {
//            end = arg;
//            setChanged();
//            notifyObservers();
//        }
//        String getStart() {
//            return start;
//        }
//        void setStart(String arg) {
//            start = arg;
//            setChanged();
//            notifyObservers();
//        }
//        String getLength() {
//            return length;
//        }
//        void setLength(String arg) {
//            length = arg;
//            setChanged();
//            notifyObservers();
//        }
//
//        void calculateLength() {
//            try {
//                int start = Integer.parseInt(getStart());
//                int end = Integer.parseInt(getEnd());
//                int length = end - start;
//                setLength(String.valueOf(length));
//            } catch (NumberFormatException e) {
//                throw new RuntimeException ("Unexpected Number Format Error");
//            }
//        }
//        void calculateEnd() {
//            try {
//                int start = Integer.parseInt(getStart());
//                int length = Integer.parseInt(getLength());
//                int end = start + length;
//                setEnd(String.valueOf(end));
//            } catch (NumberFormatException e) {
//                throw new RuntimeException ("Unexpected Number Format Error");
//            }
//        }
//    }

}
