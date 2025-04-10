# 🎮 Game Character Management Project

이 프로젝트는 자바로 구현된 간단한 RPG 스타일의 **게임 캐릭터 관리 시스템**입니다.  
마틴 파울러의 『Refactoring』 책에 나오는 다양한 **코드 스멜을 연습하고 리팩토링을 실습하기 위한 목적**으로 작성되었습니다.

---

## 📦 프로젝트 구조

```
src/
├── Game.java              // 메인 실행 클래스
├── Character.java         // 캐릭터 정보 및 아이템/전투 로직 담당
├── BattleSystem.java      // 턴 기반 전투 시스템
├── InventoryManager.java  // 인벤토리 상세 출력 도우미
```

---

## ✅ 주요 기능

- 캐릭터 생성 (이름, 종족, 스탯 초기화)
- 아이템 추가 및 사용 (공격력/방어력/체력 회복 적용)
- 적과의 전투 (공격 및 반격 처리)
- 인벤토리 출력 및 아이템 상세 정보 조회

---

## 💡 리팩토링 연습용 코드 스멜 예시

- Large Class
- Data Clumps
- Primitive Obsession
- Inappropriate Intimacy
- Feature Envy

---

## 📚 참고 문헌

- 마틴 파울러, 『Refactoring: Improving the Design of Existing Code』

---

**개발 및 실습자용으로 작성된 프로젝트입니다. 자유롭게 수정하고 리팩토링하세요!**
